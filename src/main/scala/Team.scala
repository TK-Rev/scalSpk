import scala.collection.mutable.ArrayBuffer

class Team(l:String,n:String) {
  val location:String = l
  val name:String = n

  var fwd = 0
  var roam = 0
  var defe = 0
  var goal = 0

  var roster:ArrayBuffer[Player] = new ArrayBuffer[Player]()

  def addPlayer(targ:Player): Boolean ={
    if(mainsGot){
      targ.position match {
        case "Forward" => fwd+=1
        case "Roamer" => roam+=1
        case "Defender" => defe+=1
        case "Goalie" => goal+=1
      }
      roster+=targ
      return true
    }else{
      if(roomLeft(targ.position)>0){
        targ.position match {
          case "Forward" => fwd+=1
          case "Roamer" => roam+=1
          case "Defender" => defe+=1
          case "Goalie" => goal+=1
        }
        roster+=targ
        return true
      }
    }
    false
  }

  def mainsGot: Boolean ={
    fwd>=4&&roam>=2&&defe>=4&&goal>=2
  }
  def roomLeft(pos:String): Int ={
    var res = 20

    res-=roster.length
    if(pos!="Forward")
      res-=math.max(4-fwd,0)
    if(pos!="Roamer")
      res-=math.max(2-roam,0)
    if(pos!="Defender")
      res-=math.max(4-defe,0)
    if(pos!="Goalie")
      res-=math.max(2-goal,0)

    res
  }

  def isFull: Boolean ={
    roster.length>=20
  }
  def sortByPos(): Unit={
    roster = roster.sortBy(_.position)
  }
  def sortByOVR(): Unit={
    roster = roster.sortBy(_.ovr)
  }

  override def toString: String ={
    var res = s"$location $name\n[F:$fwd | R:$roam | D:$defe | G:$goal]\n"
    roster.foreach(e=>{
      res+="  "+e.toString+"\n"
    })
    res
  }
}
