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
package cn.felord.payment.wechat.v3.model;

import lombok.Data;

/**
 * H5 信息
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class H5Info {
    /**
     * 场景类型
     */
    private H5SceneType type;
    /**
     * 应用名称
     */
    private String appName;
    /**
     * 网站URL
     */
    private String appUrl;
    /**
     * IOS 平台 BundleID
     */
    private String bundleId;
    /**
     * Android 平台 PackageName
     */
    private String packageName;

    /**
     * H5 场景类型
     *
     * @author felord.cn
     * @since 1.0.5.RELEASE
     */
    public enum H5SceneType {

        /**
         * IOS
         */
        iOS,
        /**
         * Android
         */
        Android,
        /**
         * Wap
         */
        Wap
    }
}
