package com.github.joergwmittag.toolbelt
package genericextensions

/** The K Combinator.
*
*  @tparam T  The type of the object.
*  @param  o  The object.
*/
class TapExtension[T](o: => T) {

  /** The K Combinator.
  *
  *  @param f  The function.
  *  @return   `o`
  */
  def tap(f: T => Unit) = { f(o); o }
  def tap(f: => Unit) = { f; o }
}

object TapExtension { implicit def any2Tap[T](o: => T) = new TapExtension(o) }
