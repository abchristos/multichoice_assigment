package za.co.multichoice.pathfinder;

import java.util.List;

/**
 * Example usage of this package.
 * 
 * @see NodeFactoryImpl
 * @see Node
 */
public class Usage {

	/**
	 * @param args
	 *  expects one arg for mapName to load
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println ("Usage: pathfinding.ExampleUsage test_map.txt");
			System.exit(0);
		}
		String mapName = args[0];
		Map map;
		try {
			MapLoader mapLoader = new MapLoader(new NodeFactoryImpl());
			// load map from file
			map = mapLoader.load(mapName);
			// draw terrain before solution
			map.drawMapToStdOut();
			
			AStarSearchAlgorithm pathFinderAlgorithm = new AStarSearchAlgorithm(map);
			// find solution
			List solution = pathFinderAlgorithm.findPathToGoal(); 
			pathFinderAlgorithm = null;
			
			// plot solution path on terrain map
			map.plotSolutionOnMap(solution);
				
			// print terrain map with solution
			map.writeSolutionMapToFile(mapName);

			mapLoader = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			map = null;
			
			
		}
	}

}
