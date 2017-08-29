package com.techelevator;

public class AfternoonExercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
int birds = 4 - 1;
System.out.println(birds);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
birds = 6;
int nests = 3;
int birdsDistributed= birds / nests;
System.out.println(birdsDistributed);

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
int raccoons = 3 - 2;
System.out.println(raccoons);

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
int beesAmountLessThanFlowers = 5 - 3;
System.out.println(beesAmountLessThanFlowers);

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
int pigeons = 1 + 1;
System.out.println(pigeons);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
int owls = 3 + 2;
System.out.println(owls);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
int beavers = 2 - 1;
System.out.println(beavers);

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
int toucans = 2 + 1;
System.out.println(toucans);

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
int squirrels = 4 - 2;
System.out.println(squirrels);

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
int quarter = 25;
int dime = 10;
int nickel = 5;
int centsAmount= quarter + dime + (2*nickel);
System.out.println(centsAmount);

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
int muffins= 18 + 20 + 17;
System.out.println(muffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
int hiltPurchasesCents= 24 + 14;
System.out.println(hiltPurchasesCents);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
int treats= 5;
int mini= 10;
int large= 8;
int marshmallows= treats * (mini+large);
System.out.println(marshmallows);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
int snowDiff= 29 - 17;
System.out.println(snowDiff);

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
int hiltsDollars= 10 - 3 - 2;
System.out.println(hiltsDollars);

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
int joshsMarbles= 16 - 7;
System.out.println(joshsMarbles);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
int shellsOfMegan= 19;
int targetShells= 25;
int shellsNeeded= targetShells - shellsOfMegan;
System.out.println(shellsNeeded);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
int balloonsTotal= 17;
int balloonsRed= 8;
int balloonsGreen= balloonsTotal - balloonsRed;
System.out.println(balloonsGreen);

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
int books= 38+10;
System.out.println(books);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
int beeLegs= 6;
int bees= 8;
int beesLegsTotal= beeLegs * bees;
System.out.println(beesLegsTotal);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
int iceCreamConeCostCents=99;
int costCents= iceCreamConeCostCents * 2;
System.out.println(costCents);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
int rocksTarget=125;
int rocksOnHand=64;
int rocksNeeded= rocksTarget - rocksOnHand;
System.out.println(rocksNeeded);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
int hiltsMarbles= 38 - 15;
System.out.println(hiltsMarbles);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
int milesTotal= 78;
int milesDriven= 32;
int milesLeft= milesTotal - milesDriven;
System.out.println(milesLeft);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
int minsSatMorning= 90;
int minsSatAfternoon= 45;
int minsShovelingTotl= minsSatMorning + minsSatAfternoon;
System.out.println(minsShovelingTotl);

        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
int hotdogCostCents= 6 * 50;
System.out.println(hotdogCostCents);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
int hiltsMoneyCents= 50;
int pencilCostCents= 7;
int pencilsPurchasable= hiltsMoneyCents / pencilCostCents;
System.out.println(pencilsPurchasable);

        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
int butterfliesTotal= 33;
int fliesOrange= 20;
int fliesRed= butterfliesTotal - fliesOrange;
System.out.println(fliesRed);

        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
int katesCents= 100;
int candyCostCents= 54;
int changeCents= katesCents - candyCostCents;
System.out.println(changeCents);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
int trees= 13 + 12;
System.out.println(trees);

        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
int hours = 1;
int day= 24 * hours;
int hoursTillGrandma= day * 2;
System.out.println(hoursTillGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
int gumNeeded= 4 * 5;
System.out.println(gumNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
int dansDollars= 3 - 1;
System.out.println(dansDollars);

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
int peopleOnBoats= 5 * 3;
System.out.println(peopleOnBoats);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
int legos= 380 - 57;
System.out.println(legos);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
muffins= 83 - 35;
System.out.println(muffins);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
int crayonsDiff= 1400 - 290;
System.out.println(crayonsDiff);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
int stickersTotal= 22 * 10;
System.out.println(stickersTotal);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
int cupcakesDistributed= 96 / 8;
System.out.println(cupcakesDistributed);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
int gingerbreadCookies= 47;
int cookiesRemaining= gingerbreadCookies % 6;
System.out.println(cookiesRemaining);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
int croissantsRemaining= 59 % 8;
System.out.println(croissantsRemaining);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
int trays= 276 / 12;
System.out.println(trays);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
int servingsPretzels = 480 / 12;
System.out.println(servingsPretzels);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
int boxesCupcakes= (53-2)/3;
System.out.println(boxesCupcakes);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
int carrotsRemaining= 74 % 12;
System.out.println(carrotsRemaining);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
int shelvesFilled= 98 / 7;
System.out.println(shelvesFilled);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
int albumsNeeded= 480 / 20;
System.out.println(albumsNeeded);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
int cardsCollected=94;
int boxMax=8;
int boxFilled= cardsCollected / boxMax;
int cardsRemaining= cardsCollected % boxMax;
System.out.println(boxFilled);
System.out.println(cardsRemaining);

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
int booksPerShelf= 210/10;
System.out.println(booksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
int croissantsDistributed= 17 / 7;
System.out.println(croissantsDistributed);
	}

}
