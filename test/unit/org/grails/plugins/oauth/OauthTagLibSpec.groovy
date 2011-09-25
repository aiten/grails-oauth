package org.grails.plugins.oauth

import grails.plugin.spock.TagLibSpec
import spock.lang.Unroll

@Mixin(org.grails.plugins.oauth.OauthState)
class OauthTagLibSpec extends TagLibSpec {
	
	@Unroll("Tag renders #renderedContent if session is (#sessionContent)")
	def "Tag renders or does not render depending on session"() {

		given:
		    if (sessionKey) {
		        mockSession[sessionKey] = sessionContent
		    }
		
		    connected([:]) {
		        '<h1>connected</h1>'
		    }
		    disconnected([:]) {
		        '<h2>no connection</h2>'
		    }
		
		expect:
		    out.toString().contains(renderedContent)
		
		where:
		    sessionKey          | sessionContent          | renderedContent
		    OAUTH_SESSION_KEY   | [key:'x', secret:'y']   | '<h1>connected</h1>'
		    OAUTH_SESSION_KEY   | null                    | '<h2>no connection</h2>'
		    null                | [:]                     | '<h2>no connection</h2>'
	}
}