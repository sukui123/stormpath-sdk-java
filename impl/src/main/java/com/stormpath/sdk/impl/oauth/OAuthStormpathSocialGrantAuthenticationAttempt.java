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
package com.stormpath.sdk.impl.oauth;

import com.stormpath.sdk.resource.Resource;

/**
 * This class is used to wrap the information required to build a Stormpath Social Grant Authentication request,
 * required to exchange a social provider's token for an OAuth Token.
 *
 * @since 1.1.0
 */
interface OAuthStormpathSocialGrantAuthenticationAttempt extends Resource {
    /**
     * Method used to set the Authentication Grant Type that will be used for the token exchange request.
     * @param grantType the Authentication Grant Type that will be used for the token exchange request.
     */
    void setGrantType(String grantType);

    /**
     * Method used to set the providerId (e.g. google, facebook, linkedin).
     * @param providerId the name of the provider
     */
    void setProviderId(String providerId);

    /**
     * Method used to set the accessToken.
     * @param accessToken the access token from the social provider. The accessToken or code is required.
     */
    void setAccessToken(String accessToken);

    /**
     * Method used to set the code.
     * @param code the code from the social provider. The code or accessToken is required.
     */
    void setCode(String code);
}
