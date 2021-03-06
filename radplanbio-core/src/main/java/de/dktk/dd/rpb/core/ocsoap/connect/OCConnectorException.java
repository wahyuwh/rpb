/*

	Copyright 2012 VU Medical Center Amsterdam

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	    http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

*/

package de.dktk.dd.rpb.core.ocsoap.connect;

/**
 * General connector exception.
 * @author Arjan van der Velde (a.vandervelde (at) xs4all.nl)
 */
public class OCConnectorException extends Exception {
	
	/**
	 * Create a OCConnectorException
	 */
	public OCConnectorException() {
		super();
	}

	/**
	 * Create a OCConnectorException using with a custom message and a causing Throwable object such as another Exception.
	 * @param arg0 Message
	 * @param arg1 Causing Exception
	 */
	public OCConnectorException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * Create a OCConnectorException using with a custom message.
	 * @param arg0 Message
	 */
	public OCConnectorException(String arg0) {
		super(arg0);
	}

	/**
	 * Create a OCConnectorException using a causing Throwable object such as another Exception.
	 * @param arg0 Causing Exception
	 */
	public OCConnectorException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * auto generated serialVersionUID
	 */
	private static final long serialVersionUID = 48900514851884295L;
}
