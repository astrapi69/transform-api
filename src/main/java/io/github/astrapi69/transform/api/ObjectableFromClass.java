/**
 * The MIT License
 *
 * Copyright (C) 2022 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.transform.api;

/**
 * The interface {@link ObjectableFromClass} provides a single method for transform a given
 * transformable object to a java object with giving explicitly the class type of the return type
 *
 * @param <T>
 *            the generic type of the return type
 * @param <P>
 *            the generic type of the input parameter aka the transformable object
 */
@FunctionalInterface
public interface ObjectableFromClass<T, P>
{
	/**
	 * Transforms the given transformable object to a java object
	 *
	 * @param transformable
	 *            the input that will be transformed to the generic java object
	 * @param clazz
	 *            the class from the class type of the object that will be returned
	 * @return the java object
	 */
	T toObject(final P transformable, final Class<T> clazz);
}
