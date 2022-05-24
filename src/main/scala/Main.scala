import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn.readLine

object Main {
  /*
    Plans for project;
      - A quick database system for a fictional sport league.
      - Features a quick character generator to fill a league with players.
      - Features a quick team generator to fill a league with teams.
      - Player stats in a database managed by Spark.
      - Team stats in a database managed by Spark.
      - Game schedule in a database managed by Spark.

      TODO:
        - Players Database
        - Teams Database
        - Schedule Database

      STRETCH:
        - Game simulator within scala
        - Quick updates to the databases based on results from the game simulator.
   */

  def main(args: Array[String]): Unit = {
    var teams:ArrayBuffer[Team] = new ArrayBuffer[Team]()
    var teamNames:ArrayBuffer[String] = new ArrayBuffer[String]()
    val total = 12
    var count = 0

    while(count<total){
      val loca = Generators.locationGen()
      var teamName = Generators.teamGen()

      while(teamNames.contains(teamName)){
        teamName = Generators.teamGen()
      }
      teamNames+=teamName

      val newTeam = new Team(loca,teamName)

      while (!newTeam.isFull){
        val playName = Generators.nameGen()
        val stats = Generators.statGen()
        var pos = Generators.posGen()

        var newPlayer = new Player(playName,stats(0),stats(1),stats(2),stats(3),stats(4),pos)

        newTeam.addPlayer(newPlayer)
      }

      newTeam.sortByOVR()
      newTeam.sortByPos()
      teams+=newTeam

      count+=1
    }

    teams.foreach(e=>{
      println(e.toString)
    })
  }
}
