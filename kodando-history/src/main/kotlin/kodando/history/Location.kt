package kodando.history

external interface Location {
  val pathname: String
  val search: String
  val hash: String
}