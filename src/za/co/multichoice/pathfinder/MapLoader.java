package za.co.multichoice.pathfinder;

public class MapLoader {
	private MapFactory mapFactory;
	
	/**
	 * @param nodeFactory
	 * @throws Exception
	 * 
	 * Constructor
	 */
	public MapLoader(NodeFactory nodeFactory) throws Exception {
		mapFactory = new MapFactory(nodeFactory);		
	}
	
	/**
	 * @param mapFileName
	 * @return
	 * @throws Exception
	 * 
	 * loads and returns the map loaded from the input map file name
	 */
	public Map load(String mapFileName) throws Exception {
		return mapFactory.createMap(mapFileName.trim());
	}
	
	public void finalize() {
		mapFactory = null;
	}
}
