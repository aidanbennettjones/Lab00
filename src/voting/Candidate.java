package voting;

/**
 * Representation of a candidate running for office.
 *
 * @author Grant Braught, revised by Farhan Siddiqui
 * @author Dickinson College
 * @version Jan 14, 2020
 */
public class Candidate {

	private String name;
	private String party;
	private int votes;

	/**
	 * Construct a new candidate with the specified name, party and number of
	 * votes.
	 * 
	 * @param name
	 *            the candidate's name
	 * @param party
	 *            the candidate's party
	 * @param votes
	 *            the number of votes that this candidate has.
	 */
	public Candidate(String candidateName, String candidateParty, int candidateVotes) {
		name = candidateName;
		party = candidateParty;
		votes = candidateVotes;
	}

	/**
	 * Retrieve the candidate's name.
	 * 
	 * @return the candidate's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the candidate's party.
	 * 
	 * @return the candidate's party.
	 */
	public String getParty() {
		return party;
	}

	/**
	 * Retrieve the number of votes that have been cast for this candidate.
	 * 
	 * @return this candidate's votes.
	 */
	public int getVotes() {
		return votes;
	}

	/**
	 * Change the candidate's party affiliation.
	 * 
	 * @param newParty
	 *            the candidate's new party.
	 */
	public void setParty(String newParty) {
		party = newParty;
	}

	/**
	 * Increase the number of votes for this candidate by one
	 *
	 *
	 */
	public void increaseVotes() {
		votes++;
	}

	/**
	 * Increase the number of votes for this candidate by a specified number
	 *
	 *
	 */
	public void increaseVotes(int voteCount) {
		votes = votes + voteCount;
	}

	/**
	 * Determine if this candidate defeated another candidate: e.g.
	 * joe.defeated(sam)
	 * 
	 * @param opp
	 *            the opponent of this candidate.
	 * @return true if this candidate defeated the opponent.
	 */
	public boolean defeated(Candidate opp) {
		if (this.getVotes() > opp.getVotes()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Create a new Candidate object. The new object will be referred to as
		// candidate1 within the program. The candidate1 object will be initialized so
		// that the candidate's name is Indira Patel, the candidate's party is
		// Demopublican, and the candidate's number of votes is 35,400.
		Candidate candidate1 = new Candidate("Indira Patel", "Demopublican", 35400);
		Candidate candidate2 = new Candidate("Bob Jones", "Demopublican", 45000);
		Candidate candidate3 = new Candidate("John Dow", "Demopublican", 50323);
		// Use method calls and string concatenation to print out the candidate's name
		// and number of votes.
		System.out.println(candidate1.getName() + ": " + candidate1.getVotes());
		System.out.println(candidate2.getName() + ": " + candidate2.getVotes());
		System.out.println(candidate3.getName() + ": " + candidate3.getVotes());
	}

	}

