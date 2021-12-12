## Producer-Consumer Problem

The Producer-Consumer problem is a classic example of a multi-process synchronization problem. Here, we have  a *fixed-size buffer* and two classes of threads - *producers* and *consumers*. Producers produces the data to the queue and Consumers consume the data from the queue. Both producer and consumer shares the same fixed-size buffer as a queue.

**Problem** - The producer should produce data only when the queue is not full. If the queue is full, then the producer shouldn't be allowed to put any data into the queue. The consumer should consume data only when the queue is not empty. If the queue is empty, then the consumer shouldn't be allowed to take any data from the queue.

We can solve the Producer-Consumer problem by using `wait()` & `notify()`methods to communicate between producer and consumer threads. The `wait()` method to pause the producer or consumer thread depending on the queue size. The `notify()` method sends a notification to the waiting thread.

Producer thread will keep on producing data for Consumer to consume. It will use `wait()` method when Queue is full and use `notify()` method to send notification to Consumer thread once data is added to the queue.

```java
public synchronized void produce() {
	while (queue.size() == MAX_SIZE) {
		//Queue is full, Producer thread waiting for consumer to take data from the queue
		wait();
	}
	/* When queue has space, Producer produces the data and adds them into the queue.
	*  After that, Producer sends the notification to the Consumer.
	*/
	//producing data
	queue.add(data);
	notify();
}
```


Consumer thread will consume the data form the queue. It will also use `wait()` method to wait if queue is empty. It will also use `notify()` method to send notification to producer thread after consuming data from the queue.

```java
public synchronized String consume() {
	while (messages.isEmpty()) {
		//Queue is empty, Consumer thread waiting for producer to put data to the queue
		wait();
	}
		/* When queue has data, Consumer consumes the data and removes it from the queue.
		*  After that, Consumer sends the notification to the Producer.
		*/
		//consuming data
		queue.remove(data);
		notify()
}
```
