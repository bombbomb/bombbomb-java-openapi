/**
 * BombBomb
 * We make it easy to build relationships using simple videos.
 *
 * OpenAPI spec version: 2.0.24005
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SocialsApi
 */
public class SocialsApiTest {

    private final SocialsApi api = new SocialsApi();

    
    /**
     * Gets the social email properties
     *
     * Gets the social email properties
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSocialArticlePropertiesTest() throws ApiException {
        String jerichoId = null;
        String emailId = null;
        String originatorId = null;
        // api.getSocialArticleProperties(jerichoId, emailId, originatorId);

        // TODO: test validations
    }
    
    /**
     * Gets the auto shares from the client group assoc id
     *
     * Gets the auto shares from the client group assoc id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSocialAutoSharesTest() throws ApiException {
        String clientGroupId = null;
        // api.getSocialAutoShares(clientGroupId);

        // TODO: test validations
    }
    
    /**
     * Get permissions for social integration
     *
     * Get permissions for social integration and has redirect for user to login
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSocialPermissionsTest() throws ApiException {
        String socialType = null;
        // api.getSocialPermissions(socialType);

        // TODO: test validations
    }
    
    /**
     * Gets the social state
     *
     * Gets the social state
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSocialStatusTest() throws ApiException {
        String originatorId = null;
        // api.getSocialStatus(originatorId);

        // TODO: test validations
    }
    
    /**
     * Gets the auto shares from the client group assoc id
     *
     * Gets the auto shares from the client group assoc id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSocialAutoSharesTest() throws ApiException {
        String autoShare = null;
        String clientGroupId = null;
        // api.updateSocialAutoShares(autoShare, clientGroupId);

        // TODO: test validations
    }
    
    /**
     * Sets the users social message to what they typed in
     *
     * Sets the users social message to what they typed in
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSocialMessageTest() throws ApiException {
        String message = null;
        String originatorId = null;
        // api.updateSocialMessage(message, originatorId);

        // TODO: test validations
    }
    
    /**
     * Updates the social state for the object
     *
     * Updates the social state for the object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSocialStatusTest() throws ApiException {
        String state = null;
        String originatorId = null;
        // api.updateSocialStatus(state, originatorId);

        // TODO: test validations
    }
    
}
