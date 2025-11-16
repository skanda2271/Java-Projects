package com.skanda_practice.skanda.dtoentity;

import lombok.Data;
import java.util.*;

@Data
public class RateLimiterSlidingWindow {
	private final int capacity;
	private int windowSize;
	private final HashMap<String, Deque<Integer>> userRequestMap;
	public RateLimiterSlidingWindow(int capacity, int windowSize) {
		super();
		this.capacity = capacity;
		this.windowSize = windowSize;
		this.userRequestMap = new HashMap<>();
	}
	
	public boolean allowRequest(String userId, int timeStamp) {
		Deque<Integer> requestTimesPerUser = userRequestMap.getOrDefault(userId, new LinkedList<>());
		while(!requestTimesPerUser.isEmpty() && requestTimesPerUser.peekFirst() <= timeStamp - windowSize) {
			requestTimesPerUser.pollFirst();
		}
		if(requestTimesPerUser.size() < capacity) {
			requestTimesPerUser.offerLast(timeStamp);
			userRequestMap.put(userId, requestTimesPerUser);
			return true;
		}
		return false;
	}
}
