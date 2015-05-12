package argonaut

// Defined here and not in Definitions.scala because of https://issues.scala-lang.org/browse/SI-7755
sealed trait Base
case class BaseIS(i: Int, s: String) extends Base
case class BaseDB(d: Double, b: Boolean) extends Base
case class BaseLast(c: Simple) extends Base


// Proxied implicits
object JsonCodecs {
  import Argonaut._, Shapeless._

  implicit val emptyEncodeJson = implicitly[EncodeJson[Empty.type]]
  implicit val emptyDecodeJson = implicitly[DecodeJson[Empty.type]]
  implicit val emptyCCEncodeJson = implicitly[EncodeJson[EmptyCC]]
  implicit val emptyCCDecodeJson = implicitly[DecodeJson[EmptyCC]]
  implicit val simpleEncodeJson = implicitly[EncodeJson[Simple]]
  implicit val simpleDecodeJson = implicitly[DecodeJson[Simple]]
  implicit val composedEncodeJson = implicitly[EncodeJson[Composed]]
  implicit val composedDecodeJson = implicitly[DecodeJson[Composed]]
  implicit val twiceComposedEncodeJson = implicitly[EncodeJson[TwiceComposed]]
  implicit val twiceComposedDecodeJson = implicitly[DecodeJson[TwiceComposed]]
  implicit val composedOptListEncodeJson = implicitly[EncodeJson[ComposedOptList]]
  implicit val composedOptListDecodeJson = implicitly[DecodeJson[ComposedOptList]]
  implicit val nowThreeEncodeJson = implicitly[EncodeJson[NowThree]]
  implicit val nowThreeDecodeJson = implicitly[DecodeJson[NowThree]]
  implicit val baseEncodeJson = implicitly[EncodeJson[Base]]
  implicit val baseDecodeJson = implicitly[DecodeJson[Base]]
}
