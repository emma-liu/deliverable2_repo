import static org.junit.Assert.*;

import org.junit.Test;

import org.mockito.*;

public class HouseTest {

	@Test
	public void testHouseCreation() {
		Room mockedRoom = Mockito.mock(Room.class);
		Room[] rooms = new Room[1];
		rooms[0] = mockedRoom;
		Mockito.stub(mockedRoom.getDescription()).toReturn("foo");
		House h = new House(rooms);
		String returned = h.getCurrentRoomInfo();
		assertEquals(returned, "foo");
		
	}

}
