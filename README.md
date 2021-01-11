# relayrChallenge
### Project Structure
/src/main -> source code
/src/scripts -> executing shell and dockerfile
### API
/add?dataSource={dataSource}

adding data source. return message to show success or fail

/search?productName={name}&category={category}

seach product list by name and category

### Design Idea
Class ProductBean is for restoring product information

Class SearchEndpoint is controller

Interface DataplatformConnector offer three basic functions. We could use the interface to implement a connector for different data platform


