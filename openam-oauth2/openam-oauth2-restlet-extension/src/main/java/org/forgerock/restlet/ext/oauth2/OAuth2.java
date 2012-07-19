/*
 * DO NOT REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2012 ForgeRock Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 */

package org.forgerock.restlet.ext.oauth2;

/**
 * TODO Finish this class with all constants TODO refactor to clean up what is
 * interface, storage, or both
 * 
 * @author $author$
 * @version $Revision$ $Date$
 */
public class OAuth2 {

    public enum EndpointType {
        /**
         * Authorization endpoint - used to obtain authorization from the
         * resource owner via user-agent redirection.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-3.1">3.1.
         *      Authorization Endpoint</a>
         */
        AUTHORIZATION_ENDPOINT,
        /**
         * Token endpoint - used to exchange an authorization grant for an
         * access token, typically with client authentication.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-3.2">3.2.
         *      Token Endpoint</a>
         */
        TOKEN_ENDPOINT,
        /**
         * Extension grant types MAY define additional endpoints as needed.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-3">3.
         *      Protocol Endpoints</a>
         */
        OTHER;
    }

    /*
     * public static final Set<String> params;
     * 
     * static { Set<String> paramSet = new HashSet<String>();
     * paramSet.add(Params.ACCESS_TOKEN); paramSet.add(Params.CLIENT_ID);
     * paramSet.add(Params.CLIENT_SECRET); paramSet.add(Params.CODE);
     * paramSet.add(Params.ERROR); paramSet.add(Params.ERROR_DESCRIPTION);
     * paramSet.add(Params.ERROR_URI); paramSet.add(Params.EXPIRES_IN);
     * paramSet.add(Params.GRANT_TYPE); paramSet.add(Params.PASSWORD);
     * paramSet.add(Params.REDIRECT_URI); paramSet.add(Params.REFRESH_TOKEN);
     * paramSet.add(Params.RESPONSE_TYPE); paramSet.add(Params.SCOPE);
     * paramSet.add(Params.STATE); paramSet.add(Params.TOKEN_TYPE);
     * paramSet.add(Params.USERNAME); params =
     * Collections.unmodifiableSet(paramSet); }
     */

    /**
     * The OAuth Parameters Registry's initial contents.
     */
    public class Params {

        /**
         * Parameter usage location: authorization request, token request
         */
        public static final String CLIENT_ID = "client_id";

        /**
         * Parameter usage location: token request
         */
        public static final String CLIENT_SECRET = "client_secret";

        /**
         * Parameter usage location: authorization request
         */
        public static final String RESPONSE_TYPE = "response_type";

        /**
         * Parameter usage location: authorization request, token request
         */
        public static final String REDIRECT_URI = "redirect_uri";

        /**
         * Parameter usage location: authorization request, authorization
         */
        public static final String SCOPE = "scope";

        /**
         * Parameter usage location: authorization request, authorization
         */
        public static final String STATE = "state";

        /**
         * Parameter usage location: authorization response, token request
         */
        public static final String CODE = "code";

        /**
         * Parameter usage location: authorization response, token response
         */
        public static final String ERROR = "error";
        /**
         * Parameter usage location: authorization response, token response
         */
        public static final String ERROR_DESCRIPTION = "error_description";

        /**
         * Parameter usage location: authorization response, token response
         */
        public static final String ERROR_URI = "error_uri";

        /**
         * Parameter usage location: token request
         */
        public static final String GRANT_TYPE = "grant_type";

        /**
         * Parameter usage location: authorization response, token response
         */
        public static final String ACCESS_TOKEN = "access_token";

        /**
         * Parameter usage locationon: authorization response, token response
         */
        public static final String TOKEN_TYPE = "token_type";

        /**
         * Parameter usage location: authorization response, token response
         */
        public static final String EXPIRES_IN = "expires_in";

        /**
         * Parameter usage location: token request
         */
        public static final String USERNAME = "username";

        /**
         * Parameter usage location: token request
         */
        public static final String PASSWORD = "password";

        /**
         * Parameter usage location: token request, token response
         */
        public static final String REFRESH_TOKEN = "refresh_token";

        /**
         * Parameter usage location: token request
         */
        public static final String REALM = "realm";

    }

    public class Token {
        public static final String OAUTH_ACCESS_TOKEN = "access_token";
        public static final String OAUTH_EXPIRES_IN = "expires_in";
        public static final String OAUTH_REFRESH_TOKEN = "refresh_token";
        public static final String OAUTH_TOKEN_TYPE = "token_type";
    }

    public class StoredToken {
        public static final String EXPIRY_TIME = "expiry_time";
        public static final String ISSUED = "issued";
        public static final String PARENT = "parent";
        public static final String TYPE = "type";
    }

    /**
     * 11.3.2. Initial Registry Contents
     * 
     * @see <a href="">11.3. The OAuth Authorization Endpoint Response Type
     *      Registry</a>
     */
    public class AuthorizationEndpoint {
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-4.1.1">4.1.1.
         *      Authorization Request</a>
         */
        public static final String CODE = "code";
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-4.2.1">4.2.1.
         *      Authorization Request</a>
         */
        public static final String TOKEN = "token";
    }

    /**
     * grant_type Registry
     */
    public class TokeEndpoint {
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-4.1.3">4.1.3.
         *      Access Token Request</a>
         */
        public static final String AUTHORIZATION_CODE = "authorization_code";
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-4.3.2">4.3.2.
         *      Access Token Request</a>
         */
        public static final String PASSWORD = "password";
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-4.4.2">4.4.2.
         *      Access Token Request</a>
         */
        public static final String CLIENT_CREDENTIALS = "client_credentials";
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-6">6.
         *      Refreshing an Access Token</a>
         */
        public static final String REFRESH_TOKEN = "refresh_token";
        /**
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-saml2-bearer">2.1.
         *      Using SAML20BearerServerResource Assertions as Authorization
         *      Grants</a>
         */
        public static final String SAML2_BEARER = "urn:ietf:params:oauth:grant-type:saml2-bearer";
    }

    /**
     * @see <a
     *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-24#section-5.2.1">5.2.1.
     *      The "Bearer" Authentication Scheme</a>
     */
    public class Bearer {
        /**
         * 5.2.1. The "Bearer" Authentication Scheme
         * <p/>
         * Authentication Scheme Name:
         */
        public static final String BEARER = "Bearer";
    }

    /**
     * SAML 2.0 Bearer Assertion Profiles for OAuth 2.0
     * 
     * @see <a
     *      href="http://tools.ietf.org/html/draft-ietf-oauth-saml2-bearer">SAML
     *      2.0 Bearer Assertion Profiles for OAuth 2.0</a>
     */
    public class SAML20 {
        /**
         * The value of the "client_assertion" parameter MUST contain a single
         * SAML 2.0 Assertion. The SAML Assertion XML data MUST be encoded using
         * base64url
         */
        public static final String CLIENT_ASSERTION = "client_assertion";
        public static final String CLIENT_ASSERTION_TYPE = "client_assertion_type";
        public static final String GRANT_TYPE_URI = "urn:ietf:params:oauth:grant-type:saml2-bearer";
        public static final String CLIENT_ASSERTION_TYPE_URI =
                "urn:ietf:params:oauth:client-assertion-type:saml2-bearer";

        /**
         * The value of the "assertion" parameter MUST contain a single SAML 2.0
         * Assertion. The SAML Assertion XML data MUST be encoded using
         * base64url
         */
        public static final String ASSERTION = "assertion";
    }

    /**
     * @see <a
     *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-http-mac"></a>
     */
    public class MAC {

        /**
         * Mac
         * <p/>
         * 
         * <pre>
         *  Authorization: MAC id="h480djs93hd8",
         *      ts="1336363200",
         *      nonce="dj83hs9s",
         *      mac="bhCQXTVyfj5cmA9uKkPFx1zeOXM="
         * </pre>
         */
        public static final String MAC = "MAC";

        /**
         * REQUIRED. The MAC key identifier.
         */
        public static final String ID = "id";
        /**
         * REQUIRED. The request timestamp. The value MUST be a positive integer
         * set by the client when making each request to the number of seconds
         * elapsed from a fixed point in time (e.g. January 1, 1970 00:00:00
         * GMT). The value MUST NOT include leading zeros (e.g. "000273154346").
         */
        public static final String TS = "ts";
        /**
         * REQUIRED. A unique string generated by the client. The value MUST be
         * unique across all requests with the same timestamp and MAC key
         * identifier combination.
         */
        public static final String NONCE = "nonce";
        /**
         * OPTIONAL. A string used to include additional information which is
         * covered by the request MAC. The content and format of the string is
         * beyond the scope of this specification.
         */
        public static final String EXT = "ext";
        /**
         * REQUIRED. The HTTP request MAC as described in <a href=
         * "http://tools.ietf.org/html/draft-ietf-oauth-v2-http-mac-01#section-3.2"
         * >Section 3.2</a>
         */
        public static final String MAC_PARAMETER = "mac";

        /*
         * 8.1.1. Registration Template
         * 
         * Algorithm name: The name requested (e.g., "example"). Body hash
         * algorithm: The corresponding algorithm used to calculate the payload
         * body hash. Change controller: For standards-track RFCs, state "IETF".
         * For others, give the name of the responsible party. Other details
         * (e.g., postal address, e-mail address, home page URI) may also be
         * included. Specification document(s): Reference to document that
         * specifies the algorithm, preferably including a URI that can be used
         * to retrieve a copy of the document. An indication of the relevant
         * sections may also be included, but is not required.
         * 
         * 8.1.2. Initial Registry Contents
         * 
         * The HTTP MAC authentication scheme algorithm registry's initial
         * contents are:
         * 
         * 
         * 
         * Hammer-Lahav, et al. Expires November 12, 2011 [Page 22]
         * 
         * Internet-Draft MAC Authentication May 2011
         * 
         * 
         * o Algorithm name: hmac-sha-1 o Body hash algorithm: sha-1 o Change
         * controller: IETF o Specification document(s): [[ this document ]]
         * 
         * o Algorithm name: hmac-sha-256 o Body hash algorithm: sha-256 o
         * Change controller: IETF o Specification document(s): [[ this document
         * ]]
         * 
         * 8.2. OAuth Access Token Type Registration
         * 
         * This specification registers the following access token type in the
         * OAuth Access Token Type Registry.
         * 
         * 8.2.1. The "mac" OAuth Access Token Type
         * 
         * Type name: mac Additional Token Endpoint Response Parameters: secret,
         * algorithm HTTP Authentication Scheme(s): MAC Change controller: IETF
         * Specification document(s): [[ this document ]]
         * 
         * 8.3. OAuth Parameters Registration
         * 
         * This specification registers the following parameters in the OAuth
         * Parameters Registry established by [I-D.ietf-oauth-v2].
         * 
         * 8.3.1. The "mac_key" OAuth Parameter
         * 
         * Parameter name: mac_key Parameter usage location: authorization
         * response, token response Change controller: IETF Specification
         * document(s): [[ this document ]] Related information: None
         * 
         * 8.3.2. The "mac_algorithm" OAuth Parameter
         * 
         * Parameter name: mac_algorithm
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * Hammer-Lahav, et al. Expires November 12, 2011 [Page 23]
         * 
         * Internet-Draft MAC Authentication May 2011
         * 
         * 
         * Parameter usage location: authorization response, token response
         * Change controller: IETF Specification document(s): [[ this document
         * ]] Related information: None
         */
    }

    /**
     * See <a
     * href="http://tools.ietf.org/html/draft-ietf-oauth-v2-25#section-11.4"
     * >11.4. The OAuth Extensions Error Registry</a>
     */
    public class Error {
        /**
         * A single error code
         */
        public static final String ERROR = "error";

        /**
         * OPTIONAL. A human-readable UTF-8 encoded text providing additional
         * information, used to assist the client developer in understanding the
         * error that occurred.
         */
        public static final String ERROR_DESCRIPTION = "error_description";

        /**
         * OPTIONAL. A URI identifying a human-readable web page with
         * information about the error, used to provide the client developer
         * with additional information about the error.
         */
        public static final String ERROR_URI = "error_uri";

        /**
         * The request is missing a required parameter, includes an invalid
         * parameter value, or is otherwise malformed.
         */
        public static final String INVALID_REQUEST = "invalid_request";

        /**
         * The client is not authorized to request an access token using this
         * method.
         */
        public static final String UNAUTHORIZED_CLIENT = "unauthorized_client";

        /**
         * The resource owner or authorization server denied the request.
         */
        public static final String ACCESS_DENIED = "access_denied";

        /**
         * The authorization server does not support obtaining an access token
         * using this method.
         */
        public static final String UNSUPPORTED_RESPONSE_TYPE = "unsupported_response_type";

        /**
         * The requested scope is invalid, unknown, or malformed.
         */
        public static final String INVALID_SCOPE = "invalid_scope";

        /**
         * The authorization server encountered an unexpected condition which
         * prevented it from fulfilling the request.
         */
        public static final String SERVER_ERROR = "server_error";

        /**
         * The authorization server is currently unable to handle the request
         * due to a temporary overloading or maintenance of the server.
         */
        public static final String TEMPORARILY_UNAVAILABLE = "temporarily_unavailable";

        /**
         * The access token provided is expired, revoked, malformed, or invalid
         * for other reasons. The resource SHOULD respond with the HTTP 401
         * (Unauthorized) status code. The client MAY request a new access token
         * and retry the protected resource request.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-bearer-17#section-3.1">Error
         *      Codes</a>
         */
        public static final String INVALID_TOKEN = "invalid_token";

        /**
         * The request requires higher privileges than provided by the access
         * token. The resource server SHOULD respond with the HTTP 403
         * (Forbidden) status code and MAY include the "scope" attribute with
         * the scope necessary to access the protected resource.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-bearer-17#section-3.1">Error
         *      Codes</a>
         */
        public static final String INSUFFICIENT_SCOPE = "insufficient_scope";

        /**
         * The access token provided has expired. Resource servers SHOULD only
         * use this error code when the client is expected to be able to handle
         * the response and request a new access token using the refresh token
         * issued with the expired access token. The resource server MUST
         * respond with the HTTP 401 (Unauthorized) status code.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-5.2.1">5.2.1.
         *      Error Codes</a>
         */
        public static final String EXPIRED_TOKEN = "expired_token";

        /**
         * The client identifier provided is invalid, the client failed to
         * authenticate, the client did not include its credentials, provided
         * multiple client credentials, or used unsupported credentials type.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-4.3.1">4.3.1.
         *      Error Codes</a>
         */
        public static final String INVALID_CLIENT = "invalid_client";

        /**
         * Handles all errors that don't stem from invalid requests -- e.g.,
         * perhaps errors resulting from databases that are down or logic errors
         * in code.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-4.3.1">4.3.1.
         *      Error Codes</a>
         */
        public static final String UNKNOWN_ERROR = "unknown_error";

        /**
         * The provided access grant is invalid, expired, or revoked (e.g.
         * invalid assertion, expired authorization token, bad end-user password
         * credentials, or mismatching authorization code and redirection URI).
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-4.3.1">4.3.1.
         *      Error Codes</a>
         */
        public static final String INVALID_GRANT = "invalid_grant";

        /**
         * The provided access grant is invalid, expired, or revoked (e.g.
         * invalid assertion, expired authorization token, bad end-user password
         * credentials, or mismatching authorization code and redirection URI).
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-4.3.1">4.3.1.
         *      Error Codes</a>
         */
        public static final String UNSUPPORTED_GRANT_TYPE = "unsupported_grant_type";

        /**
         * The code provided is invalid.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-4.3.1">4.3.1.
         *      Error Codes</a>
         */
        public static final String INVALID_CODE = "invalid_code";

        /**
         * The redirection URI provided does not match a pre-registered value.
         * 
         * @see <a
         *      href="http://tools.ietf.org/html/draft-ietf-oauth-v2-10#section-3.2.1">3.2.1.
         *      Error Codes</a>
         */
        public static final String REDIRECT_URI_MISMATCH = "redirect_uri_mismatch";

        /**
         * The requested authentication type is not supported by the
         * authorization server.
         */
        public static final String UNSUPPORTED_AUTH_TYPE = "unsupported_auth_type";

        /**
         * The request is for data which does not exist.
         */
        public static final String NOT_FOUND = "not_found";
    }

    public class Custom {
        /**
         * This parameter indicates whether the user should be prompted to grant
         * account access to your application each time he tries to complete a
         * particular action. The default value is auto, which indicates that a
         * user would only need to grant access the first time he tried to
         * access a protected resource.
         * <p/>
         * Set the parameter value to force to direct the user to a consent page
         * even if he has already granted access to your application for a
         * particular set of scopes."
         */
        public static final String APPROVAL_PROMPT = "approval_prompt";
        public static final String AUTO = "auto";
        public static final String FORCE = "force";
        public static final String DECISION = "decision";
        public static final String ALLOW = "allow";
        public static final String DENY = "deny";
        /**
         * The display mode in which to render the dialog. The default is
         * {@code page} on the www subdomain and {@code wap} on the m subdomain.
         * {@code touch}: Used on smartphone mobile devices, like iPhone and
         * Android. Use this for tablets with small screens (i.e., under 7
         * inches) as well. {@code wap}: Display plain HTML (without JavaScript)
         * on a small screen, such as a Nokia 7500. page: By default, dialogs
         * run in full-page mode with a Facebook header and footer. This is
         * appropriate for apps that do a full-page redirect in a normal
         * desktop/laptop web browser. popup: For use in a browser popup no
         * bigger than 400px by 580px. Use this display type to maintain context
         * for the user while on an external website. iframe: Display the dialog
         * in a lightbox iframe on the current page. Because of the risk of
         * clickjacking, this is only allowed for some certain dialogs, and
         * requires you to pass a valid access_token.
         */
        public static final String DISPLAY = "display";

        public static final String REALM = "realm";

        public static final String AUDIENCE = "audience";
        public static final String USER_ID = "user_id";

    }

    public enum DisplayType {
        IFRAME, PAGE, POPUP, TOUCH, WAP;

        public String getFolder() {
            return name().toLowerCase();
        }
    }
}