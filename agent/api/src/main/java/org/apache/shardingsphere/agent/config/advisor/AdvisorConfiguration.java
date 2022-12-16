/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.agent.config.advisor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.agent.config.advisor.method.type.ConstructorAdvisorConfiguration;
import org.apache.shardingsphere.agent.config.advisor.method.type.InstanceMethodAdvisorConfiguration;
import org.apache.shardingsphere.agent.config.advisor.method.type.StaticMethodAdvisorConfiguration;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Advisor configuration.
 */
@RequiredArgsConstructor
@Getter
public final class AdvisorConfiguration {
    
    private final String targetClassName;
    
    private final Collection<ConstructorAdvisorConfiguration> constructorAdvisors = new LinkedList<>();
    
    private final Collection<InstanceMethodAdvisorConfiguration> instanceMethodAdvisors = new LinkedList<>();
    
    private final Collection<StaticMethodAdvisorConfiguration> staticMethodAdvisors = new LinkedList<>();
}
