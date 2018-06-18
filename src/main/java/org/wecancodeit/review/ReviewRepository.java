package org.wecancodeit.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	
	private Map <Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review grandCanyonNorthRim = new Review(1111L, "The Grand Canyon, North Rim",
				"https://www.flickr.com/photos/steffophotography/15020176542/in/photolist-28aUUDS-e21BG2-XzSbpw-C1Vpfm-aLEBhV-XALqqL-oThkc5-nz7EW7-dompH1-e4MkMi-YouYui-mKeJm-qowLgf-e4MkJv-nRy5YW-acYPdH-r3Z5SQ-mKehJ-mKeRH-ZQ1C5f-5EaZU7-a1BWcr-dr2Pkb-DHyF8-25pigGU-8rWdDm-sg4m2i-rAAwBd-dJwSig-pJ9JdG-cr3Tps-qV5hEJ-f4hV1N-9Jtr7i-qVpVD5-SHUWEn-GRZK1F-96MWzq-4kSWnM-hkV86Q-K2GM8M-HcuX6c-9nPpkN-9XipAW-TEdXoG-bZGUpL-fw3ucj-p3ky38-dCZJ5b-4gijHA/lightbox/",
				"National Parks Reviews for People Who Don't Plan",
				"We stopped at the North Rim of Grand Canyon National Park just in time for their Star Party. This was a trip without itinerary, so there was no booking ahead. "
				+ "That means we had no expectation of getting a campsite at the grand canyon. We just had Lydia, who doesn't know a stranger. Our plan was to let her do her Jr. Ranger thing and"
				+ " hike around a bit to see the sights and search for elusive kaibab squirrels, then move on and find a campsite further along the road."
				+ "/n/t  A trail led us through the campsite, where the child decided to chat with an old guy"
				+ "while waiting for Mom to go to the bathroom. That old guy happened to be in with the Star Party folks who had a few campsites to spare. Sheer dumb luck. "
				+ "So we hung out with astronomers from all over the country, saw ring nebulas and galaxies colliding, looked through telescopes bigger than all of us combined, and had a grand old time!"
				+ "The facilities were excellent. The people were friendly. We never did see those squirrels, though.",
				"Not too busy. Amazing views. Come for the Star Party. You'll be amazed... but unless you're lucky, you have to plan ahead!");
		
		Review joshuaTree = new Review(1112L, "Joshua Tree", "https://www.flickr.com/photos/paulasun/33055097483/in/photolist-SmY1RR-7rKGR5-7rGDta-eWmpQR-eWmy5n-677kKt-dopooX-DQe6Tv-oKg7eP-64QwCE-67byWN-8WTJSA-buvLUG-anZoGe-qMhERV-7rGNS6-8PGy3b-SBw44Z-232DQDW-FKLfnz-d7scJw-XCiso7-zeM8n-EPXEch-5FCSN5-95cC9u-8a5SQ1-DQe7bK-bifNdV-9R9BmF-AhmN9f-22sgaKf-95cD7E-babjDM-p2u6ov-6rqdpb-8a2HyV-6yMVLv-42YtSS-a3fV6h-p4fiW9-aJVwiv-iXD1zk-4zNXSA-9AKx8t-9BWoPK-7TMq86-VZMyRD-VZMEmB-6w48bi",
				"National Parks Reviews for People Who Don't Plan",
				"Joshua Tree was HOT! 104 when we arrived in the evening. Too hot to cook. Almost too hot to set up our tents. But everything was bone-dry, so it was great for star-gazing. "
				+ "Then the obnoxious teenagers or twenty-somethings arrived. Then there was a viper in the bathroom. But quiet came and sleep did too. We had to break camp early to beat the heat"
				+ "of the next day and get some hiking it. It would top 110." + "/n /t The thing about Joshua Tree is the trails aren't marked so well. They meander up rocks and down slopes and there are dy stream beds"
				+ "to contend with. First we lost Lydia. She may have been chasing a lizard. It's hard to tell. I had to put in an extra half-mile just to find her. Then we lost Uncle John. It was an ordeal."
				+ "/n /t Beyond vipers and lost souls and heat, Joshua Tree holds other dangers. Those cute, fuzzy-looking TeddyBear Cholla will do some damage if you run into one!"
				+ " There are old abandoned mine-shafts that inquiring and prococious children could get into if given enough time and not enough supervision. And then there's the Oasis! "
				+ "It's full of tall, beautiful palms, shady, misty, humming with wildlife - and it's completely toxic. Something to do with mining waste. Aren't people wonderful?"
				+ " /n /t Once our hike was over and our group was all present and counted for, we packed up to explore the park by vehicle.Hooray for Air Conditioning! We saw rock climbers "
				+ "and wild landscapes. Joshua Tree looks like something out of /'The Land Before Time/'. But it was obscenely hot. Even in the cool of the car, my phone crapped out and we got a little lost.",
				"Wild landscapes! Some trails are not suitable for young children or unathletic old people.");
		
		Review carlsbadCaverns = new Review(1113L, "Carlsbad Caverns", "https://www.flickr.com/photos/mathieulebreton/7828989980/in/photolist-cVPBXS-2A6raq-26gfnTT-dsCbxZ-dsB51b-4zp6iP-27yz4WQ-dsCfLe-4wb2j3-cWFn9y-cWFydw-571Dbo-abXzTs-am3z3H-am3DYH-yUVEQv-25oL5dU-owm1aB-dsAzyY-bYfBGs-2zFjBq-kQxe2n-9epNJX-6UFQBx-KQprjN-4eX7Ut-kNEczJ-buopct-dCy749-9X15aZ-W7yu3L-kQvyHn-26MdHXp-4ckwed-buophp-cYE8GE-dPdFKC-hLo58h-2zACgx-am6sAA-8aaTSs-fNS5d5-onWTef-6UKVHN-ZAqQqF-XVfA6a-21SknH9-XwyMPw-GYxJuk-YztoDy", 
				"National Parks Reviews for People Who Don't Plan",
				"Carlsbad Caverns is on the southern border of New Mexico and Texas. We sought it out early on in our trip because my kid loves bats. She's obsessed with them. The problem was"
				+ "that our map (yes, we're navigating by map in this day and age. We had planned on going through some rough terrain and wifi doesn't reach everywhere) was from 2009."
				+ "A lot can change in 8 years. The campsite we wanted to visit? Yeah, turns out that doesn't exist anymore. So we went to the Carlsbad Caverns Visitor Center to inquire."
				+ "They had some deal with the highly-commercialized vacation resort type thing at the bottom of the hill. Not our scene. But they were also having a bat talk in five minutes and if we hurried, we could make it."
				+ "/n /t Yeah, bats! Imagine a huge ampitheater at the mouth of an even huger cave. Cool air. Quiet people. Darkening desert skies. Then, before you're really sure what's happening, out rush the bats."
				+ "It was a BATNADO! We made it a word, so now that's a thing."
				+ "/n /t It was dark by the time we got out of there and we still didn't have a place to pitch our tent. We drove south, following the little teepee pictures on our map, but time after time, were SOL. "
				+ "We drove until we were back in Texas - at another National Park! You get a two-fer! Kind-of."
				+ "/n /t So we found ourselves in the dark at 11 PM at a completely jam-packed campsite in Guadalupe Mountains National Park in South-West Texas. Luckily, able-bodied people"
				+ "are allowed to use the wheelchair accessible tent pads if nobody has claimed them after 10PM. There was one left. We set up camp in the dark and woke to birdsong and dense fog. It had nearly cleared by the time we were ready to go."
				+ "So really, we didn't see much of Guadalupe. Not much of a two-fer. Sorry."
				+ "/n /t Back at Carlsbad, we had some exploring to do! It was busy. The trails wound all over the inside of the cavern systems, up, down, around. We learned about white nose syndrome"
				+ "and how the caves were formed. We got dripped on and prayed it wasn't guano. It wasn't. And we beat the heat! Also, we decided that the things they name cave structures are lame.", 
				"Carlsbad Caverns National Park is fascinating! They also need more camping in the region. BATNADO!");
		
		Review yosemite = new Review(1114L, "Yosemite", "https://www.flickr.com/photos/radiantmark/3526156625/in/photolist-6nAtvT-KVvP1e-nQFJFG-nQAYMf-anmkrm-cgL3nu-cgL9EW-cgLoVC-cgL9hN-cgLMSS-cgLEVy-cgLAxA-r42Mpp-f9T5eq-amnJCd-nfz7XP-aN3KER-yuUE8i-qzk8oA-ayb5YD-88iCsu-hPffav-97yFYd-fNjM2u-93TWcd-f3hK5Q-o8mjBY-P8Vo6d-L9CM9j-97CJj2-9pXC4o-rC8P4N-7trfYT-9h3BS5-di2KNc-eTjAJU-iGuZXp-Mq91yb-ed8ddP-rQoZUe-TdXVWw-UtSKwK-CK46Ld-f3hG5S-f33szX-wBGNWv-AGmCB-HgXjGh-gpgojC-eTkUJC",
				"National Parks Reviews for People Who Don't Plan",
				"Yosemite National Park is not for people who don't plan. Nevermind the campsite. You have to get there early just to find a place to park! It feels like the whole valley is nothing but a parking lot."
				+ "Joni Mitchell knows what's up. We tried to check the place out in the evening, but got so fed up driving around, looking for somewhere to park, that we just gave up and went back to the campsite in the end and decided to come back the next morning."
				+ "/n /t We'd heard about the congestion and found a site about a 30 minute drive away from the camp entrance earlier in the day.  \"There are plenty of sites like this on the way up the mountain. Finding a spot wasn't hard."
				+ "The forest around was badly burned, so the mountains looked strange and half-bare. And there were bear boxes. Mom was genuinely concerned that the bears might be tempted into our tent by the smell of stinky kid feet, "
				+ "so Lydia's shoes went in the bear box, too. But we ate and we camped and we got up early to go to Yosemite the next morning. "
				+ "/n /t Even at 7:30 AM it was beyond busy. We went by several lots that were completely full before finally finding a spot. The problem was that, even after finding a spot, most of the buildings weren't open yet."
				+ "Lydia did her Junior Ranger thing and we hiked up up up alongside throngs of other people at varying speeds. We got soaked with all the other tourists, precariously climbing one single set of slippery stone stairs"
				+ "in both directions, up some more until, finally, we ventured beyond where the masses dared to go. And yes, it was beautiful, but so busy!"
				+ " We had to hike so far to escape the crowds that the hike back almost made us miss the last shuttle back to our parking lot! "
				+ "/n /t The shuttle system is great for making Yosemite accessible. We were glad to use them to view as much of the vast Park as possible before moving along. Their facilities are among the best we've seen."
				+ "The native people they have working there are wonderful. We even saw a guy making arrow-heads out of old pyrex! Cool!",
				"They paved Paradise and put up a parking lot. Yosemite is not for people who don't plan.") ;
		
		reviewList.put(grandCanyonNorthRim.getID(), grandCanyonNorthRim);
		reviewList.put(joshuaTree.getID(), joshuaTree);
		reviewList.put(carlsbadCaverns.getID(), carlsbadCaverns);
		reviewList.put(yosemite.getID(), yosemite);
		
	}
	//constructor for testing purposes
	public ReviewRepository(Review...reviews) {
		for(Review review : reviews) {
			reviewList.put(review.getID(), review);
		}
	}

	//methods
	public Review findOne(Long id) {
		return reviewList.get(id);
	}
	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
