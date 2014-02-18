package za.co.multichoice.pathfinder.test;

import junit.framework.TestCase;
import za.co.multichoice.pathfinder.Map;
import za.co.multichoice.pathfinder.MapLoader;
import za.co.multichoice.pathfinder.NodeFactoryImpl;


public class MapLoaderTest extends TestCase {

	public static final String MAP1_NAME = "test_map.txt";
	public static final String LARGE_MAP_NAME = "large_map.txt";
	private static final int MAP1_LENGTH = 5;
	private static final int MAP1_WIDTH = 5;
	
	public void testLoad() {
		try {
			Map map = createTestMapFromFile(MAP1_NAME);
			assertEquals(map.getNumRows(), MAP1_LENGTH);
			assertEquals(map.getNumColumns(), MAP1_WIDTH);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	public static Map createTestMapFromFile(String mapName) throws Exception {
		MapLoader mapLoader = new MapLoader(new NodeFactoryImpl());
		Map map = (Map) mapLoader.load(mapName);
		return map;
	}

}
