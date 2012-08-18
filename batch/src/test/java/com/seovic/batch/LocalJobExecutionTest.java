/*
 * Copyright 2009 Aleksandar Seovic
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

package com.seovic.batch;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Job execution tests that use local thread-pool based executor for step
 * execution.
 * 
 * @author Aleksandar Seovic  2009.11.06
 */
public class LocalJobExecutionTest
        extends AbstractJobExecutionTest
    {
    protected ExecutorService getExecutor()
        {
        return Executors.newCachedThreadPool();
        }
    }
