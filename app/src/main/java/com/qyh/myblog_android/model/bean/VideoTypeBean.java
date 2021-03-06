/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.qyh.myblog_android.model.bean;

/**
 * 类  名： VideoTypeBean
 * 描  述：
 * 创建人： qyh
 * 日  期： 2018年03月30日 14:22
 * 版本号： 1.0
 * <p>
 * Copyright (c) 2018 www.g7.com.cn Inc. All rights reserved
 */
public class VideoTypeBean {

    /**
     * video_type_name : 源码解析
     * video_type_id : 1
     */

    private String video_typename;
    private int video_typeid;

    public String getVideo_typename() {
        return video_typename;
    }

    public void setVideo_typename(String video_typename) {
        this.video_typename = video_typename;
    }

    public int getVideo_typeid() {
        return video_typeid;
    }

    public void setVideo_typeid(int video_typeid) {
        this.video_typeid = video_typeid;
    }

    @Override
    public String toString() {
        return "VideoTypeBean{" +
                "video_typename='" + video_typename + '\'' +
                ", video_typeid=" + video_typeid +
                '}';
    }
}