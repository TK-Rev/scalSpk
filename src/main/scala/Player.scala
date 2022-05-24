class Player(n:String,s:Int,p:Int,e:Int,b:Int,c:Int,pos:String) {
  val name:String = n
  val spd:Int = s
  val pwr:Int = p
  val end:Int = e
  val blk:Int = b
  val ctl:Int = c
  var position:String = pos

  val ovr:Int = (spd+pwr+end+blk+ctl)/5

  override def toString: String ={
    s"$position | $name | [$ovr OVR]"
  }
}
