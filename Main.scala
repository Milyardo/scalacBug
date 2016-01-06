object Main extends App {
   val service = new Service
  class HH extends H[HH,String]
  def f[T <: H[_,_]](t: T): T = service.processG(t)
  f(new HH)
}
