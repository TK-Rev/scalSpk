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
        - Character Generator
          - Names
          - Positions
        - Team Generator
          - Locations
          - Names
        - Players Database
        - Teams Database
        - Schedule Database

      STRETCH:
        - Game simulator within scala
        - Quick updates to the databases based on results from the game simulator.
   */

  def main(args: Array[String]): Unit = {
    val tote = 50
    var count = 0
    while (count < tote){
      println(Generators.positionGen()+" | "+Generators.nameGen())

      count+=1
    }
  }
}
