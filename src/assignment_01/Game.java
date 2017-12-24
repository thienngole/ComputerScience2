package assignment_01;

import java.util.Objects;

/**
 * This is a assignment_01.Game class. This class is used for instantiating the assignment_01.Game objects.
 * This class does not contain a main method or any I/O code. This class
 * contains  a constructor, a get method, a toString method, an equals method,
 * and a method name dateOfGameCheck to make sure the game date is between
 * 20160101 and 20160531.
 *
 * @author Thien Ngo N. Le
 * @version 20160907
 */
public class Game {
    private String gameID;
    private String homeTeamID;
    private String guestTeamID;
    private String dateOfTheGame;
    private int homeTeamScore;
    private int guestTeamScore;

    /**
     * This constructor initialize all the fields in the class.
     *
     * @param gameID         the ID number of the game.
     * @param homeTeamID     the ID number of the home team.
     * @param guestTeamID    the ID number of the guest team.
     * @param dateOfTheGame  the date of the game.
     * @param homeTeamScore  the score of the home team.
     * @param guestTeamScore the score of the guest team.
     */

    public Game(String gameID, String homeTeamID, String guestTeamID,
                String dateOfTheGame, int homeTeamScore, int guestTeamScore) {
        this.gameID = gameID;
        this.homeTeamID = homeTeamID;
        this.guestTeamID = guestTeamID;
        this.dateOfTheGame = dateOfTheGame;
        this.homeTeamScore = homeTeamScore;
        this.guestTeamScore = guestTeamScore;
    }

    /**************************************************************************
     * This method gets the ID number of the game.
     *
     * @return ID number of the game.
     */
    public String getGameID() {
        return gameID;
    }// End getGameID

    /**************************************************************************
     * This method gets the ID number of the home team.
     *
     * @return ID number of home team.
     */
    public String getHomeTeamID() {
        return homeTeamID;
    }// End getHomeTeamID

    /**************************************************************************
     * This method gets the ID number of the guest team.
     *
     * @return the ID number of guest team.
     */
    public String getGuestTeamID() {
        return guestTeamID;
    }// End getGuestTeamID

    /**************************************************************************
     * This method gets the date of the game.
     *
     * @return the date of the game.
     */
    public String getDateOfTheGame() {
        return dateOfTheGame;
    }// End getDateOfTheGame

    /**************************************************************************
     * This method gets the score of the home team.
     *
     * @return the score of the home team.
     */
    public int getHomeTeamScore() {
        return homeTeamScore;
    }// End getHomeTeamScore

    /**************************************************************************
     * This method gets the score of the guest team.
     *
     * @return the score of guest team.
     */
    public int getGuestTeamScore() {
        return guestTeamScore;
    }// End getGuestTeamScore

    @Override
    /**************************************************************************
     * This method displays all objects of the assignment_01.Game class.
     *
     * @return gameID, homeTeamID, guestTeamID, dateOfTheGame, homeTeamScore, 
     * and guestTeamScore
     */
    public String toString() {
        return "assignment_01.Game{" + "gameID: " + gameID + ", homeTeamID: " + homeTeamID +
                ", guestTeamID: " + guestTeamID + ", dateOfTheGame: " +
                dateOfTheGame + ", homeTeamScore: " + homeTeamScore +
                ", guestTeamScore: " + guestTeamScore + '}';
    }// End toString

    @Override
    /**************************************************************************
     * This method checks all objects in the assignment_01.Game class to make sure that they
     * are correct.
     *
     * @return true or false.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Game other = (Game) obj;

        if (this.homeTeamScore != other.homeTeamScore) {
            return false;
        }
        if (this.guestTeamScore != other.guestTeamScore) {
            return false;
        }
        if (!Objects.equals(this.gameID, other.gameID)) {
            return false;
        }
        if (!Objects.equals(this.homeTeamID, other.homeTeamID)) {
            return false;
        }
        if (!Objects.equals(this.guestTeamID, other.guestTeamID)) {
            return false;
        }
        if (!Objects.equals(this.dateOfTheGame, other.dateOfTheGame)) {
            return false;
        }
        return true;
    }// End equals

    /**************************************************************************
     * This method check the date of the game to make sure that the date of the 
     * game is between 20160101 and 20160531
     *
     * @return true or false.
     */
    public boolean dateOfGameCheck() {
        boolean result = true;
        int date = Integer.parseInt(dateOfTheGame);
        if (date >= 20160101 && date <= 20160531) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }// End dateOfGameCheck


}// End assignment_01.Game class
