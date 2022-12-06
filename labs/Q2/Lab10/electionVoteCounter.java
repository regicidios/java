package labs.Q2.Lab10;

import java.util.Scanner;

public class electionVoteCounter
{
	public static void main (String[] args)
    {
		int votesForPolly;  // number of votes for Polly in each precinct
		int votesForErnest; // number of votes for Ernest in each precinct
		int totalPolly = 0;     // running total of votes for Polly
		int totalErnest = 0;    // running total of votes for Ernest
		int pollyPrecints = 0;  // number of precincts won by Polly
		int ernestPrecints = 0;  // number of precincts won by Ernest
		int precintTie = 0;

		String response;	// answer ("y" or "n") to the "more precincts" question

		Scanner scan = new Scanner(System.in);

		System.out.println ();
		System.out.println ("Election Day Vote Counting Program");
		System.out.println ();
		
		do{

			System.out.println ("How many votes did Polly Tichen get?");
			votesForPolly = scan.nextInt();
			System.out.println ("How many votes did Ernest Orator get?");
			votesForErnest = scan.nextInt();

			if (votesForPolly > votesForErnest){
				pollyPrecints++;
			}
			else if (votesForPolly < votesForErnest){
				ernestPrecints++;
			}
			else {
				precintTie++;
			}

			totalPolly += votesForPolly;
			totalErnest += votesForErnest;
			System.out.println("Are there any additional precincts that need to be counted? (yes/no)");
			response = scan.next();

		}while(response.equalsIgnoreCase("yes"));

		scan.close();
		double pollyPercent = 100*((double)totalPolly / (double)(totalPolly + totalErnest));
		double ernestPercent = 100*((double)totalErnest / (double)(totalPolly + totalErnest));
		System.out.format("Polly had a total of %d votes and %.4f%% of the total votes. \n", totalPolly, pollyPercent);
		System.out.format("Ernest had a total of %d votes and %.4f%% of the total votes. \n", totalErnest, ernestPercent);
		System.out.format("Polly won %d precincts. \n", pollyPrecints);
		System.out.format("Ernest won %d precincts. \n", ernestPrecints);

		if (precintTie > 0){
			System.out.format("There were %d ties.", precintTie);
		}
	}
}