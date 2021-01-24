package exceptions;

import playerdto.PlayerDTO;
import playerservice.PlayerService;

public class ExceptionTester {

	public static void main(String[] args) {

		PlayerService playerService = new PlayerService();

		PlayerDTO dto = new PlayerDTO();
		

		playerService.showDetails(dto);
	}

}
