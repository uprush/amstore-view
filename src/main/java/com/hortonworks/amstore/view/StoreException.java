/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hortonworks.amstore.view;

public class StoreException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6437342056953900191L;

	public static enum CODE {
		ERROR, WARNING, INFO, DEBUG
	};

	protected CODE code = CODE.ERROR;

	public StoreException() {
		super();
	}

	public StoreException(String message) {
		super(message);
	}

	public StoreException(String message, CODE code) {
		super(message);
		this.code = code;
	}

	// public StoreException(String message, Throwable cause) { super(message,
	// cause); }
	// public StoreException(Throwable cause) { super(cause); }

	public CODE getCode() {
		return code;
	}

	public void setCode(CODE code) {
		this.code = code;
	}

}
