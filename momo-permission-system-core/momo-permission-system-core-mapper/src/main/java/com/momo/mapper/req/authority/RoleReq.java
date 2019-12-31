/**
 * Copyright (c) 2018-2019, Jie Li 李杰 (mqgnsds@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.momo.mapper.req.authority;

import com.momo.common.core.error.BaseReq;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * Created by MOMO on 2019/4/9.
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(of = {"id"})
public class RoleReq extends BaseReq {

    /**
     * uuid UUID.
     */
    @NotBlank(message = "uuid必填",groups = {Modify.class,Status.class,Detail.class,Permission.class})
    private String uuid;
    /**
     * compId 租户id.
     */
    private Long tenantId;
    /**
     * disabledFlag 状态 0启用  1禁用.
     */
    @NotNull(message = "状态 0启用  1禁用 必填",groups = {Save.class,Modify.class,Status.class})
    private Integer disabledFlag;

    /**
     * roleName 角色名称.
     */
    @NotBlank(message = "角色名称 必填",groups = {Save.class,Modify.class})
    private String sysRoleName;
    /**
     * roleType 角色的类型，0：管理员角色，1：普通用户 2其他.
     */
    @NotNull(message = "角色的类型 必填",groups = {Save.class,Modify.class})
    private Integer sysRoleType;

}
