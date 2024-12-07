
Link to Frontend: https://github.com/summerliu-usf/democracy_frontend

Problem Solved
This project seeks to transform the way people interact with educational material by offering AI-driven discussions and podcasts for the two books selected by client. It attempts to simplify complex ideas about democracy and enhance engagement by integrating modern tools into the learning process.


Target Audience
The application is designed for students, researchers, and lifelong learners who want to engage with academic content in a more interactive way. It also caters to educators searching for supplemental teaching tools that provide new ways to inspire curiosity in their students.


Next Steps
The project aims to fully integrate OpenAI to enable real-time chapter-based discussions and improve overall performance. Expansion of the content library and optimization for a smoother user experience are also priorities for the future.


Database Structure
The app organizes chapters with specific data members, including a unique chapter identifier, the chapter title, a podcast URL, an ID linking to the corresponding book, and an AI assistant ID for handling chapter-related queries.


AI Features
The project envisions using AI to enable chapter-specific discussions, generate and answer relevant questions, and provide contextual insights to enhance understanding. 

Running the Project
The deployed app currently fetches chapter details from the backend database and displays them on the frontend. While OpenAI integration remains incomplete, users can see a valid fetch and a valid podcast URL for Tyranny of the Minority Chapter 1.

Access: https://democracyfrontend.wl.r.appspot.com/ 
This leads to the front end. 


Challenges
This project turned out to be an unexpetedly challenge despite spending over 50 hours on it. Still unsure why backend doesn't compile with the MojoException error as before, it might have been the way I imported OpenAIConversation. It was also difficult to write my own functions in front end to try and access oPENAI (but still in fornt end code). 

Trying to integrate OpenAIConversation into the backend using LangChain4j has been one of the most challenging parts of this project. Spring Boot and Maven had compatibility issues that were difficult to resolve. Spent hours debugging Mojo errors with little progress.

Switching to the frontend for OpenAI integration seemed like a simpler path, but it turned out to be equally frustrating. Calling OpenAI directly from the frontend resulted in many bad request errors, with no clear explanation from the API responses. Despite multiple attempts to adjust the request payloads and configurations, the errors persisted and I ran out out of time :( 

Another approach on top of direct OpenAI calls involved experimenting with OpenAI's Beta Assistant ID feature, hoping to assign an AI assistant for chapter-specific queries. However, this also ended in failure. The direct calls required creating threads, adding assistant ID to them, and polling to see if they were complete. I did not have enough time to accomplish this. 

As someone developing this project solo, the workload felt overwhelming at times. 


Video: https://drive.google.com/file/d/1Wl872dNjYYc0mNM25IHh2mmkZpK7LBw-/view?usp=drive_link
