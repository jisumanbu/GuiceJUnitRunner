/**
 * Copyright (C) 2011 Fabio Strozzi (fabio.strozzi@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// TestModule.java, created by Fabio Strozzi on Mar 27, 2011
package eu.fabiostrozzi.guicejunitrunner;

import com.google.inject.AbstractModule;

import eu.fabiostrozzi.guicejunitrunner.DummyComponent;
import eu.fabiostrozzi.guicejunitrunner.IComponent;

/**
 * A trivial Guice configuration.
 * 
 * @author Fabio Strozzi
 */
public class ComponentsTestModule extends AbstractModule {

    /*
     * (non-Javadoc)
     * 
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure() {
        bind(IComponent.class).to(DummyComponent.class);
    }

}
