/*
 *
 *  Copyright 2019-2022 felord.cn
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package cn.felord.payment.wechat.v3;


import cn.felord.payment.wechat.WechatPayProperties;
import lombok.Data;

import java.security.KeyPair;

/**
 * 微信支付元数据Bean.
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class WechatMetaBean {
    /**
     * The Key pair.
     */
    private KeyPair keyPair;
    /**
     * The Serial number.
     */
    private String serialNumber;
    /**
     * The Tenant id.
     */
    private String tenantId;
    /**
     * The V3.
     */
    private WechatPayProperties.V3 v3;

}
