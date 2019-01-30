package com.techelevator;

import java.text.DecimalFormat;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make it difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int eatingRacoons = 2;
		int playingRacoons = 3;
		int numOfRacoonsLeft = playingRacoons - eatingRacoons;

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */ int numFlowers = 5;
        	int numBees = 3;
        	int beesMinusFlowers = numFlowers - numBees;

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
        	int lonelyPigeon = 1;
        	int visitingPigeon = 1;
        	int numPigeons = lonelyPigeon + visitingPigeon;
        			

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
        	int fenceOwls = 3;
        	int oddOwls = 2;
        	int numOwls = fenceOwls + oddOwls;
        		

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
        	int homeBeavers = 2;
        	int swimBeavers = 1;
        	int totalBeavers = homeBeavers - swimBeavers;
        		

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
        	int treeToucan = 2;
        	int oddToucan = 3;
        	int toucans = treeToucan + oddToucan;

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
        	int treeSquirrels = 4;
        	int nuts = 2;
        	int noNutSquirrels = treeSquirrels - nuts;
        	System.out.println(noNutSquirrels);

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
        	int quarter = 1;
        	int dime = 1;
        	int nickels = 2;
        	double quarterValue = 0.25;
        	double dimeValue = 0.10;
        	double nickelValue = 0.05;
        	double cents = ((quarter* quarterValue) + (dime * dimeValue) + (nickels * nickelValue));
        	System.out.println(cents);
        			

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
        	int Briers = 18;
        	int MacAdams = 20;
        	int Flannery = 17;
        	int firstGrade = Briers + MacAdams + Flannery;
        	System.out.println("First grade made " + firstGrade + " muffins");
        			
        	

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        	double yoyo = .24;
        	double whistle = .14;
        	double cost = yoyo + whistle;
        	System.out.println("They cost " + cost + " doll hairs");
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        	int miniMini = 10;
        	int largeLarge = 8;
        	int demMarshmellows = miniMini + largeLarge;
        	System.out.println(demMarshmellows + " marshmellows");
        			
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        	int hilt = 29;
        	int brecknock = 17;
        	int moreSnow = hilt - brecknock;
        	System.out.println(moreSnow + "inches more");
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        	int hiltWallet = 10;
        	int truck = 3;
        	int pencil = 2;
        	int bank = hiltWallet - truck - pencil;
        	System.out.println("Hilt has " + bank + " dollars left.");
        		
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        	int marbles = 17;
        	int lostMarbles = 7;
        	int newMarbles = marbles - lostMarbles;
        	
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        	int hasSeashells = 19;
        	int goalSeashells = 25;
        	int seashellsToGet = goalSeashells - hasSeashells;
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        	int balloons = 17;
        	int redBalloons = 8;
        	int greenBalloons = balloons - redBalloons;
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        	int shelfBooks = 38;
        	int moreBooks = 10;
        	int totesBooks = shelfBooks + moreBooks;
        	System.out.println("There are " + totesBooks + " books.");
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        	int legsOnBees = 6;
        	int groupBees = 8;
        	int legsForDays = legsOnBees * groupBees;
        	System.out.println("There are " + legsForDays + " legs on 8 bees!");
        	
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        	int iceCreamCones = 2;
        	double price = 0.99;
        	double grandPrice = iceCreamCones * price;
        	System.out.println("Two ice cream cones cost " + grandPrice + " dollars.");
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        	int hiltRocks = 64;
        	int goalRocks = 125;
        	int fillGap = goalRocks - hiltRocks;
        	System.out.println("Mrs. Hilt will need " + fillGap + " more rocks.");
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        	int ownedMarbles = 38;
        	int lostCause = 15;
        	int newBatch = ownedMarbles - lostCause;
        	System.out.println("Mrs. Hilt has " + newBatch + " marbles left.");
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        	int concertMiles = 78;
        	int distanceDriven = 32;
        	int milesLeft = concertMiles - distanceDriven;
        	System.out.println("The sisters have " + milesLeft + " miles left to drive.");
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        	double morning = 90;
        	double afternoon = 45;
        	double saturdaySnow = (morning + afternoon)/60;
        	System.out.println("Mrs Hilt spent " + saturdaySnow + " hours shoveling snow.");
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        	double hotDogs = 6;
        	double coins = 0.50;
        	double moneySpent = hotDogs * coins;
        	System.out.println("The hot dogs cost " + moneySpent + " dollars.");
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        	int utensil = 7;
        	int hiltBank = 50;
        	int numUtensils = hiltBank / utensil;
        	System.out.println("she can buy " + numUtensils + " pencils.");
        	
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        	int butterflies = 33;
        	int orangeButterflies = 20;
        	int tTButterflies = butterflies - orangeButterflies;
        	
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        	DecimalFormat decFor = new DecimalFormat("0.00");
        	Double candy = .54;
        	Double dollar = 1.00;
        
        	Double leftovers = dollar - candy;
        	System.out.println("Kate got back $" + decFor.format(leftovers) + ".");
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        	int backyardTrees = 13;
        	int plantTrees = 12;
        	int allTrees = backyardTrees + plantTrees;
        	System.out.println("There will be " + allTrees + " trees.");
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        	int day = 24;
        	int numDays = 2;
        	int numHours = day * numDays;
        	System.out.println("Joy will see her grandma in " + numHours + " hours");
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        	int cousins = 4;
        	int sticksGum = 5;
        	int totalGum = cousins * sticksGum;
        	System.out.println("Kim will need " + totalGum + " sticks of gum");
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        	int danBank = 3;
        	int candyBar = 1;
        	int moneyLeft = danBank - candyBar;
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        	int boats = 5;
        	int capacity = 3;
        	int peopleInBoats = boats * capacity;
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        	int legos = 380;
        	int missingPieces = 57;
        	int setLeft = legos - missingPieces;
        	System.out.println("Ellen has " + setLeft + " pieces of legos left.");
        
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        	int arthursMuffins = 35;
        	int totalMuffins = 83;
        	int muffinsToBake = totalMuffins - arthursMuffins;
        	System.out.println("Arthur has to bake " + muffinsToBake + " more muffins.");
        			
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        	int willsCrayons = 1400;
        	int lucyCrayons = 290;
        	int moreCrayons = willsCrayons - lucyCrayons;
        	System.out.println("Will has " + moreCrayons + " more crayons than Lucy");
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        	int stickers = 10;
        	int pages = 22;
        	int totalStickers = stickers * pages;
        	System.out.println("There will be " + totalStickers + " total stickers.");
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        	int cupcakes = 96;
        	int children = 8;
        	int equalCakes = cupcakes/children;
        	System.out.println("each kid will have " + equalCakes + " atleast cupcakes.");
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        	int gingerbreadCookies = 47;
        	int jarContents = 6;
        	int numJars = gingerbreadCookies/jarContents;
        	System.out.println("There will be " + numJars + " jars.");
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        	int croissants = 59;
        	int neighbors = 8;
        	int numCroissants = croissants%neighbors;
        	System.out.println("There will be " + numCroissants + " croissants leftover.");
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        	int goalCookies = 276;
        	int trayHolds = 12;
        	int numTrays = goalCookies/trayHolds;
        	System.out.println("Marian will need " + numTrays + " trays to bake these cookies.");
        
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        	int numPretzels = 480;
        	int servingSize = 12;
        	int numServings = numPretzels/servingSize;
        	System.out.println("Marian will have to prepare " + numServings + " servings.");
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        	int lemonCupcakes = 53;
        	int cakesLeft = 2;
        	int cakesBox = 3;
        	int numBoxes = (lemonCupcakes-cakesLeft)/cakesBox;
        	System.out.println("There were " + numBoxes + " boxes given away");
        
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        	int carrotSticks = 74;
        	int peopleServed = 12;
        	int carrotsLeft = carrotSticks%peopleServed;
        	System.out.println("There were " + carrotsLeft + " carrots uneaten.");
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        	int teddyBears = 98;
        	int shelfHolds = 7;
        	int numShelves = teddyBears/shelfHolds;
        	System.out.println("There will be " + numShelves + " shelves filled.");
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        	int album = 20;
        	int pictures = 480;
        	int numAlbums = pictures/album;
        	System.out.println("Susie will need " + numAlbums + " albums for the pictures.");
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        	int tradingCards = 94;
        	int boxes = 8;
        	int totalBoxes = tradingCards/boxes;
        	System.out.println(totalBoxes + " boxes were filled.");
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        	int books = 210;
        	int totalShelves = 10;
        	int numBooks = books/totalShelves;
        	System.out.println("Each shelf will contain " + numBooks + " books.");

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        	int bakedCroissants = 17;
        	int numGuests = 7;
        	int totalCroissants = bakedCroissants/numGuests;
        	System.out.println("Each guest will have " + totalCroissants + " croissants." );

        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B." 
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
 
            
	}

}