package fr.lunatech.fpfpp.css

import scalacss.internal.mutable.StyleSheet
import scalacss.DevDefaults._
import scala.concurrent.duration._

object SpiderStyle extends StyleSheet.Inline {

  import dsl._

  val spiderwebCornerRight = style(
    position.absolute,
    height(300.px),
    width.auto,
    right(-10.px),
    top(-10.px),
    zIndex(1),
    opacity(1.2)
  )

  val spiderwebCornerLeft = style(
    position.absolute,
    left(-10.px),
    bottom(-10.px),
    height(300.px),
    zIndex(1),
    opacity(1.2),
    transform := "rotate(-180deg)"
  )

  val spiderOrbit = keyframes(
    0.%% -> keyframe(transform := "scale(0.6) translate(0, 0) rotate(0deg)"),
    40.%% -> keyframe(transform := "scale(0.6) translate(20px, 200px) rotate(-12deg)"),
    64.%% -> keyframe(transform := "scale(0.6) translate(20px, 200px) rotate(180deg)"),
    65.%% -> keyframe(transform := "scale(0.6) translate(20px, 200px) rotate(180deg)"),
    100.%% -> keyframe(transform := "scale(0.6) translate(0, 0) rotate(180deg)")
  )

  val spiderAppear = keyframes(
    0.%% -> keyframe(left(-30.px), bottom(-30.px)),
    50.%% -> keyframe(left(75.px), bottom(75.px)),
    100.%% -> keyframe(left(-30.px), bottom(-30.px))
  )

  val spiderMove = keyframes(
    0.%% -> keyframe(marginTop(330.px)),
    50.%% -> keyframe(marginTop(430.px)),
    100.%% -> keyframe(marginTop(330.px))
  )

  val redLunatech = c"#e71b1c"

  val spiderBottomLeft = style(
    transform := "rotate(230deg)",
    left(15.px),
    bottom(15.px),
    animationName(spiderAppear),
    animationDuration(9.second),
    animationTimingFunction.cubicBezier(.4, 0, 0.2, 1)
  )

  val spiderTopLeft = style(
    top(15.px),
    left(15.px),
    animationDuration(7.second),
    animationName(spiderOrbit),
  )

  val spiderTopRight = style(
    marginTop(210.px),
    right(5.%%),
    animationName(spiderMove),
    animationDuration(4.second),
    &.before(
      position.absolute,
      content := "''",
      width(1.px),
      background := "#AAAAAA",
      left(50.%%),
      top(-600.px),
      height(600.px)
    )
  )

  val spider = style(
    position.absolute,
    height(40.px),
    width(50.px),
    borderRadius(50.%%),
    backgroundColor(redLunatech),
    animationIterationCount.infinite,
    zIndex(1),
    boxShadow := "0px 0px 16px 0px #101010, inset 0px 0px 6px 0px #101010"
  )

  val eye = style(
    position.absolute,
    top(16.px),
    height(14.px),
    width(12.px),
    background := "#FFFFFF",
    borderRadius(50.%%),
    &.after(
      position.absolute,
      content := "''",
      top(6.px),
      height(5.px),
      width(5.px),
      borderRadius(50.%%),
      background := "black"
    )
  )
  val eyeLeft = style(
    left(14.px),
    &.after(
      right(3.px)
    )
  )

  val eyeRight = style(
    right(14.px),
    &.after(
      left(3.px)
    )
  )

  val legsWriggleLeft = keyframes(
    0.%% -> keyframe(transform := transformLeg(36, -20)),
    25.%% -> keyframe(transform := transformLeg(15, -20)),
    50.%% -> keyframe(transform := transformLeg(40, -20)),
    75.%% -> keyframe(transform := transformLeg(15, -20)),
    100.%% -> keyframe(transform := transformLeg(36, -20)),
  )

  val leg = style(
    top(6.px),
    height(12.px),
    width(14.px),
    borderTop(2.px, solid, redLunatech),
    borderRight(1.px, solid, transparent),
    borderBottom(1.px, solid, transparent),
    transform := transformLeg(36, -20),
    borderLeft(2.px, solid, redLunatech),
    borderRadius(60.%%, `0`, `0`, `0`),
    animationName(legsWriggleLeft),
    animationDuration(1.second),
    animationDelay(0.2.second),
    animationTimingFunction.ease,
    animationIterationCount.infinite,
    animationDirection.normal,
    animationPlayState.running,
    zIndex(1),
    position.absolute,
    &.nthLastOfType(2)(
      top(14.px),
      right(-11.px),
      animationDelay(0.8.second),
    ),
    &.nthLastOfType(3)(
      top(20.px),
      right(-13.px),
      animationDelay(0.2.second),
    ),
    &.nthLastOfType(4)(
      top(25.px),
      right(-12.px),
      animationDelay(0.4.second),
    ),
    &.nthLastOfType(6)(
      top(14.px),
      left(-11.px),
      animationDelay(0.4.second),
    ),
    &.nthLastOfType(7)(
      top(22.px),
      left(-12.px),
      animationDelay(0.8.second),
    ),
    &.nthLastOfType(8)(
      top(27.px),
      left(-10.px),
      animationDelay(0.3.second),
    )
  )

  def transformLeg(rotate: Double, skewX: Double) =
    s"rotate(${rotate}deg) skewX(${skewX}deg)"

  val legLeft = style(
    left(-15.px),
    transformOrigin := "top, right",
  )

  val legRight = style(
    right(-15.px),
    transformOrigin := "top, left",
  )
}
