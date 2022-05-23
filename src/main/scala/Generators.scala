import scala.util.Random

object Generators {
  val God = new Random()

  val fName:Array[String] = Array("Austin","Winona","Jasper","Casper","Alpha","Brandon","Delilah","Dakota","Eliza","Elliot","Colin","Roselyn","Melody",
    "Darnell","Tiago","Diego","Whitney","Bianca","Breanna","Brianna","Mozzie","Steven","Steve","Joseph","Juno","Jane","Ruby","Sapphire",
    "Lorette","Lizette","Petra","Tetra","Tess","Twiss","Thane","Fang","Barnaby","Brun","Amber","Elyssia","River","Magna","Zosha","Sargon",
    "Maverick","JT","TJ","AJ","Ace","Aren","Allen","Alice","Allison","Axel","Agnes","Isabelle","Rosie","Audie","Abby","Kyara","Kris","Fenton",
    "Levi","Beta","Dazzle","Luxen","Teslan","Shade","Shadow","Sylvie","Sylvia","Sylvio","Flare","Aqua","Melony","Estinien","Thancred","Zach","Zack",
    "Jet","Tristan","Flint","Remi","Romero","Ronny","Chris","Darius","Damien","Wilford","Blitz","Moxxie","Millie","Prince","Princeton","Samara",
    "Myrtle","Sabrina","Sebastian","Basil","Berry","Cherry","Apple","Citrine","Marina","Mario","Lotus","Wizzy","Amero","Aero","Larry","Iggy","Ludwig",
    "PK","Mack","Matt","Matthew","Bart","Artyom","Ivan","Ivor","Igor","Alex","Alexander","Alexandra","Alexis","Alexiak","Kodiak","Cody","Kody","Travis",
    "Trevor","Zeriah","Seriah","Sierra","Sienna","Vienna","Pierre","Belle","Benedict","Winston")
  val lName:Array[String] = Array("Subban","Blackwood","Birchwood","Rosewood","Elliot","Wyckoff","Slate","Panaman","Claude","Johnson","Nurse","Zajac",
    "Carlson","Karlson","Frebauch","Giorgiev","Lochless","Nabakov","Karianov","Starova","Skyfall","Whirlwind","Sunstreak","Sunspire","Johns","Jones",
    "Aubrey","Jameroquai","Moonhooch","Ozborne","Jovi","Belladonna","Gonzales","Rodriguez","Tamriel","Felwood","Winterspring","Ashenvale","Galaway",
    "Hathaway","Thornton","Connor","Siberia","Antoine","Dulette","Marigold","Franz","Wood","Woods","Watt","Popper","Hopper","Vasquez","Petranova",
    "White","Brown","Black","Prosper","Chicane","Strayrose")

  def nameGen(): String ={
    val name = fName(God.nextInt(fName.length))+" "+lName(God.nextInt(lName.length))

    name
  }

  val pos:Array[String] = Array("Forward","Forward","Forward","Forward","Roamer","Roamer","Defender","Defender","Defender","Defender","Goalie","Goalie")

  def positionGen(): String ={
    pos(God.nextInt(pos.length))
  }

  def locationGen(): String ={
    "Port Ollivan"
  }

  def teamGen(): String ={
    "Leviathans"
  }
}