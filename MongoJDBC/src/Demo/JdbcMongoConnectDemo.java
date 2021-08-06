package Demo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JdbcMongoConnectDemo {
	public static void main(String[] args) {
		//1.client connected to server 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		
		//acessing database
		MongoDatabase database=mongoClient.getDatabase("Moviesdb");
		
		//
		MongoCollection<Document> collection=database.getCollection("Movies");
		
		//
		FindIterable<Document> iterDocument=collection.find();
		
		
	/*	Iterator it=iterDocument.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		*/
		MongoCursor<Document> cursor=collection.find().iterator();
		while(cursor.hasNext()) {
			Document  movies=cursor.next();
			System.out.println(movies.get("Name"));
		}
		
	}
	

}
