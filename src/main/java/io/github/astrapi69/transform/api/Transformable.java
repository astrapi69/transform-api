package io.github.astrapi69.transform.api;

/**
 * The interface {@link Transformable} provides a single method for transform the given java object
 * to a transformable object. An example for the transformable object can be json string or xml
 * string
 *
 * @param <P>
 *            the generic type of the input argument object type
 * @param <T>
 *            the generic type of the return type aka transformable object
 */
@FunctionalInterface
public interface Transformable<T, P>
{
	/**
	 * Transforms the given java object to a transformable object. An example for the transformable
	 * object can be json string or xml string
	 *
	 * @param javaObject
	 *            the java object to transform to a transformable object
	 * @return the transformable object from the given java object
	 */
	T toTransformable(final P javaObject);
}
