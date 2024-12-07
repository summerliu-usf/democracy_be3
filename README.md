Link to frontend: https://github.com/summerliu-usf/democracy_frontend  

Problem Solved  
Aiming to make educational content engaging by offering interactive AI discussions and podcasts for book chapters.  

Target Audience  
- Students, researchers, and lifelong learners.  
- Educators seeking supplemental tools for teaching.  

Next Steps  
- Fully integrate OpenAI for chapter-based discussions.  
- Expand content and improve performance.  

Database Structure  

The app stores chapters with the following data members:  
- chapId: Unique chapter identifier
- title: Chapter title
- podcastUrl: Link to the chapter's podcast
- bookId: Identifier linking to the corresponding book
- assistantId: AI assistant for chapter queries


AI Features  

The app plans to integrate AI for:  
- Chapter discussions through OpenAI assistants.  
- Generating and answering chapter-related questions.  
- Enhancing learning with contextual insights.  

Although OpenAI/OpenAIConversation integration is incomplete due to compatibility issues with Maven/Spring Boot, the groundwork is in place. Also attempted to call OpenAI in frontend and did not work successfully. Tried to integrate assistant ID in OpenAI's Beta where assistant ID was integrated into conversations by initiating a new thread and also failed. 


Running the Project: access https://democracyfrontend.wl.r.appspot.com/ (this is the version where OpenAIConversation was not integrated into the backend. This version simply fetches chapter details from the backend database and displays them in front end, and front end is supposed to call OpenAI directly) 


Challenges  

Integrating langchain4j with Spring Boot proved difficult. I developed solo which also doubled the workload. Calling OpenAI directly turned out to be difficult as well and got many bad request errors. 


Video

