package de.kp.elastic;
/*
 * Copyright 2019, Dr. Krusche & Partner PartG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.ObjectParser;
import org.elasticsearch.common.xcontent.XContentParser;

public class SystemServiceStatusRequest {

	public static final ParseField SERVICE_NAME = new ParseField("serviceName");

	private static final ObjectParser<SystemServiceStatusRequest, Void> PARSER = new ObjectParser<>("system", SystemServiceStatusRequest::new);

	static {
		PARSER.declareString(SystemServiceStatusRequest::setServiceName, SERVICE_NAME);
	}

	public static SystemServiceStatusRequest parseRequest(XContentParser parser) {
		SystemServiceStatusRequest request = PARSER.apply(parser, null);
		return request;
	}

	private String serviceName;

	public SystemServiceStatusRequest() {
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceName() {
		return this.serviceName;
	}

}    

