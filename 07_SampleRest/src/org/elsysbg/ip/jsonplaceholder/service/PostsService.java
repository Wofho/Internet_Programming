package org.elsysbg.ip.jsonplaceholder.service;

import java.util.LinkedList;
import java.util.List;

import org.elsysbg.ip.jsonplaceholder.model.Post;

/**
 * TODO write tests for posts service
 */
public class PostsService {

	private final List<Post> posts =
			new LinkedList<Post>();
	
	private long lastPostId = 0;

	public List<Post> getPosts() {
		return posts;
	}
	
	public Post getPost(long postId) {
		for (Post next : posts) {
			if (next.getId() == postId) {
				return next;
			}
		}
		return null;
	}
	// synchronized because of lastPostId
	public synchronized Post createPost(Post post) {
		lastPostId++;
		// will be done in DB
		post.setId(lastPostId);
		posts.add(post);
		return post;
	}
	public Post updatePost(long postId, Post post) {
		final Post fromDb = getPost(postId);
		// only body and title should be updated
		// author should not be changed
		// disadvantage is that we can miss some
		// fields that can be updated
		fromDb.setBody(post.getBody());
		fromDb.setTitle(post.getTitle());
		return fromDb;
	}
	public void deletePost(long postId) {
		final Post toBeDeleted = getPost(postId);
		posts.remove(toBeDeleted);
	}

}