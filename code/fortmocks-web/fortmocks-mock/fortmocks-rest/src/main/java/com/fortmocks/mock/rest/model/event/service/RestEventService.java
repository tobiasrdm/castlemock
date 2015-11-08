/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.mock.rest.model.event.service;


import com.fortmocks.core.model.event.service.EventService;
import com.fortmocks.mock.rest.model.event.RestEvent;
import com.fortmocks.mock.rest.model.event.dto.RestEventDto;

import java.util.List;

/**
 * The REST event service provides all the functionality available for REST events.
 * @author Karl Dahlgren
 * @since 1.0
 */
public interface RestEventService extends EventService<RestEvent, RestEventDto> {
    /**
     * The events for a specific method id
     * @param restMethodId The id of the method that the event belongs to
     * @return Returns a list of events
     */
    public List<RestEventDto> findEventsByMethodId(final Long restMethodId);
}