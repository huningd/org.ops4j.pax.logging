/*
 * Copyright (c) 2004-2005 SLF4J.ORG Copyright (c) 2004-2005 QOS.ch
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute, and/or sell copies of  the Software, and to permit persons
 * to whom  the Software is furnished  to do so, provided  that the above
 * copyright notice(s) and this permission notice appear in all copies of
 * the  Software and  that both  the above  copyright notice(s)  and this
 * permission notice appear in supporting documentation.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR  A PARTICULAR PURPOSE AND NONINFRINGEMENT
 * OF  THIRD PARTY  RIGHTS. IN  NO EVENT  SHALL THE  COPYRIGHT  HOLDER OR
 * HOLDERS  INCLUDED IN  THIS  NOTICE BE  LIABLE  FOR ANY  CLAIM, OR  ANY
 * SPECIAL INDIRECT  OR CONSEQUENTIAL DAMAGES, OR  ANY DAMAGES WHATSOEVER
 * RESULTING FROM LOSS  OF USE, DATA OR PROFITS, WHETHER  IN AN ACTION OF
 * CONTRACT, NEGLIGENCE  OR OTHER TORTIOUS  ACTION, ARISING OUT OF  OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 * Except as  contained in  this notice, the  name of a  copyright holder
 * shall not be used in advertising or otherwise to promote the sale, use
 * or other dealings in this Software without prior written authorization
 * of the copyright holder.
 *
 */

package org.slf4j;


/**
 * Implementaitons of this interface are used to manufacture {@link Marker}
 * instances.
 * 
 * <p>See the section <a href="http://slf4j.org/faq.html#3">Implementing 
 * the SLF4J API</a> in the FAQ for details on how to make your logging 
 * system conform to SLF4J.
 * 
 * @author Ceki G&uuml;lc&uuml;
 */
public interface IMarkerFactory {

  /**
   * Manufacture a {@link Marker} instance by name. If the instance has been 
   * created earlier, return the previously created instance. 
   * 
   * <p>Null name values are not allowed.
   *
   * @param name the name of the marker to be created, null value is
   * not allowed.
   *
   * @return a Marker instance
   */
  Marker getMarker(String name);
  
  /**
   * Checks if the marker with the name already exists. If name is null, then false 
   * is returned.
   * 
   * @return true id the marker exists, false otherwise.
   * @param name the name of the marker.
   */
  boolean exists(String name);
}
