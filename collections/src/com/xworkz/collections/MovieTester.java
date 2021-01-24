package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MovieTester {

	public static void main(String[] args) {
		MovieDTO dto1 = new MovieDTO("kgf2", 5, 3, "action");
		MovieDTO dto2 = new MovieDTO("om", 4, 3, "drama");
		MovieDTO dto3 = new MovieDTO("majili", 5, 3, "love");
		MovieDTO dto4 = new MovieDTO("shree", 5, 3, "love");
		Collection<MovieDTO> movieDTOs = new ArrayList();
		movieDTOs.add(dto1);
		movieDTOs.add(dto2);
		movieDTOs.add(dto3);
		movieDTOs.add(dto4);
		Iterator<MovieDTO> iterator = movieDTOs.iterator();
		while (iterator.hasNext()) {
			MovieDTO movie=iterator.next();
			System.out.println(movie);
			if(movie.getGenre().equals("action")) {
				iterator.remove();
				movie.setGenre(null);
				movieDTOs.remove(movie);
			}
		}
		
		System.out.println("movie after removing comedy"+movieDTOs.size());
		for (MovieDTO dto:movieDTOs) {
			{
				System.out.println(dto);
			}
			
		}
		
		
	}

}
