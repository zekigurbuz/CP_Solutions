
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class eligibility {
  public static void main (String [] args) throws IOException {
	  BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
	  int times = Integer.parseInt(file.readLine());
	  for (int asdf = 0; asdf < times; asdf++) {
		  StringTokenizer reader = new StringTokenizer(file.readLine());
		  String name = reader.nextToken();
		  boolean eligible = false;
		  boolean petition = true;
		  int studies = Integer.parseInt(reader.nextToken().substring(0,4));
		  int birth = Integer.parseInt(reader.nextToken().substring(0,4));
		  double courses = Integer.parseInt(reader.nextToken());
		  if (studies >= 2010) {
			  eligible = true;
		  }
		  else if (birth >= 1991) {
			  eligible = true;
		  }
		  else if (courses >= 41) {
			  petition = false;
		  }
		  else {
			  eligible = false;
			  petition = true;
		  }
		  System.out.println(name + (eligible ? " eligible" : (petition ? " coach petitions" : " ineligible")));
	  }
  }
}
