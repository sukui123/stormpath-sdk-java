/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.oauth;

/**
 * This class represents a request for Stormpath to authenticate an Account and exchange a token for a valid
 * OAuth 2.0 access token. Uses stormpath_token grant type.
 *
 * @since 1.1.0
 */
public interface OAuthStormpathTokenGrantRequestAuthentication extends OAuthGrantRequestAuthentication {
    /**
     * Returns the token provided. This must be specified for a valid request.
     * @return a String value with the token value.
     */
    String getToken();
}
