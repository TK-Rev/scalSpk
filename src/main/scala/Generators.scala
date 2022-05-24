import scala.util.Random

object Generators {
  val God = new Random()

  val sylStart:Array[String] = Array("B","C","D","F","G","H","J","K","L","M","N","P","Qu","R","S","T","V","W","X","Z",
    "Sh","Ch","Kl","Cl","Br","Bl","Wh","St","Th","Dr","Pr","Pl","Ph","Tl","Tr","Ts")
  val sylEnd:Array[String] = Array("a","e","i","o","u","y","a","e","i","o","u","y",
    "eo","ie","ia","ai","oi","ue","ye","ar","at","ac","eh","eia","oa","ui","ey","as","es","is","or","er","ir","ur","us","ius","ous",
    "an","en","ian","in","ion","on","aon","oan","oar","aer","air","ul","ol","el")
  def nameGen(firstMax:Int=2,lastMax:Int=3): String ={
    // for a first name;
    var first = sylStart(God.nextInt(sylStart.length))+sylEnd(God.nextInt(sylEnd.length))
    var count = 0
    while(count<God.nextInt(firstMax)){
      first+=sylStart(God.nextInt(sylStart.length)).toLowerCase
      first+=sylEnd(God.nextInt(sylEnd.length))
      count+=1
    }

    // for a last name;
    var last = sylStart(God.nextInt(sylStart.length))+sylEnd(God.nextInt(sylEnd.length))
    var coun = 0
    while(coun<God.nextInt(lastMax)){
      last+=sylStart(God.nextInt(sylStart.length)).toLowerCase
      last+=sylEnd(God.nextInt(sylEnd.length))
      coun+=1
    }

    first+" "+last
  }

  def statGen(tier:Int=3): Array[Int] ={
    // should return an array of size 5 (6?);
    // should feature stats for;
    // Speed, Power, Endurance, Accuracy, Control

    // tier is on a list of 1-5, where;
    // tier 1 players tend to have an average between 50-60
    // tier 2 is 60-70, 3 is 70-80, 4 is 80-90, and 5 is 90-100

    val overall = 40+God.nextInt(10)+10*tier

    var spd = math.min(overall+God.nextInt(21)-10,99)
    var pwr = math.min(overall+God.nextInt(21)-10,99)
    var end = math.min(overall+God.nextInt(21)-10,99)
    var blk = math.min(overall+God.nextInt(21)-10,99)
    var ctl = math.min(overall+God.nextInt(21)-10,99)


    Array(spd,pwr,end,blk,ctl)
  }

  val positions:Array[String] = Array("Forward","Forward","Forward","Forward","Roamer","Roamer",
    "Defender","Defender","Defender","Defender","Goalie","Goalie")
  var posDex = 0
  def posGen(): String={
    posDex = God.nextInt(positions.length)
    positions(posDex)
  }

  val locPre:Array[String] = Array("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
    "New ","North ","South ","West ","East ","Port ","Old ")
  val locMid:Array[String] = Array("Charl","Dubl","Orl","Oll","Y","P","Skyl","Morrow","Lafey","Arm","Karlb","Edis","H","Gl","Narof",
    "Vidof","Sk","Ironf","Stormw","D","Worch","March","M","V","K","B","Darrol","Alv","Scarl","Rosew","Sl","Starr","Cl","Anah","Jers",
    "Penns","Loch","G")
  val locEnd:Array[String] = Array("otte","in","eans","ando","ivan","ork","earl","ands","ind","ette","ello","erg","urg","arrow",
    "aro","en","earth","on","orge","allow","ollow","arsh","urian","arwin","arch","ark","orian","ester","an","arro","une","orm","ood",
    "umber","idge","ar","eanse","eim","ey","yl","e")
  val locPos:Array[String] = Array("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
    " City"," Town","ville","ton","wood","glen","shire","vania","mania","ridge","view")
  def locationGen(): String ={
    val loca = locPre(God.nextInt(locPre.length))+locMid(God.nextInt(locMid.length))+locEnd(God.nextInt(locEnd.length))+locPos(God.nextInt(locPos.length))

    loca
  }

  val teamNames:Array[String] = Array("Tigers","Lions","Panthers","Penguins","Cougars","Sharks","Barracudas","Birds","Hawks","Eagles",
    "Pumas","Otters","Roos","Kangaroos","Bats","Canaries","Parrots","Ravens","Coyotes","Hyenas","Wolves","Jaguars","Dolphins","Whales",
    "Canucks","Orcas","Rhinos","Gazelles","Vultures","Pandas","Grizzlies","Bears","Kodiaks","Foxes","Bullfrogs","Bulldogs","Bruisers",
    "Bandits","Outlaws","Troopers","Warriors","Knights","Kings","Monarchs","Queens","Hunters","Skyhawks","Honorbound","Cruisers",
    "Fighters","Champions","Aces","Dynamos","Rogues","Ninjas","Captains","Veterans","Strikers","Tamers","Pathfinders","Charmers","Explorers",
    "Royalty","Crushers","Powerhouse","Express","Wild","Elite","Storm","Bombers","Fleet","Mammoths","Pioneers","Seekers","Pirates","Ironclad",
    "Roses","Thorns","Skeletons","Haunters","Nightmare","Ghosts","Titans","Giants","Jets")
  def teamGen(): String ={
    val team = teamNames(God.nextInt(teamNames.length))

    team
  }
}