package za.co.multichoice.pathfinder;

/**
 * A simple Factory for nodes.
 */
public class NodeFactoryImpl implements NodeFactory {

        public AbstractNode createNode(int x, int y, char terrainSymbol) {
            return new Node(x, y, terrainSymbol);
        }

}
