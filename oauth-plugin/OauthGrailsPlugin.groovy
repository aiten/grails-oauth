/*
 * Copyright 2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class OauthGrailsPlugin {
    def version = 0.3
    def dependsOn = [:]

    // TODO Fill in these fields
    def author = "Yong Rong (Damien) Hou"
    def authorEmail = "houyongr@gmail.com"
    def title = "Adds OAuth capability to Grails apps"
    def description = '''\
	This plugin wraps up the OAuth Java implementation and provides out-of-the-box
	OAuth functionality for Grails apps
	'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/Oauth+Plugin"
	                                      
    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

}
