# OAuth & OpenID Connect Lab

## Project Overview

This project demonstrates how to implement OAuth 2.0 and OpenID Connect authentication using Google as the identity provider in a Spring Boot application. The key objectives are to:

- Implement CSRF prevention measures.
- Set up OAuth 2.0 authorization.
- Use OpenID Connect for authentication and user information retrieval.
- Manage user sessions securely.

## Features

- **CSRF Prevention**: Configured CSRF tokens for secure form submissions.
- **OAuth 2.0**: Integrated OAuth 2.0 flow for user authentication using Google.
- **OpenID Connect**: Retrieved user information (e.g., email, profile) using OpenID Connect.
- **Session Management**: Implemented secure session management practices, including session fixation protection and session timeout configuration.

## Setup Instructions

### Prerequisites

- Java 21 or later
- Maven 3.6.3 or later
- Google Cloud account

### Google OAuth 2.0 Configuration

1. **Create a Google Cloud Project**:
    - Go to the [Google Cloud Console](https://console.cloud.google.com/).
    - Create a new project and enable the "Google People API."

2. **Create OAuth 2.0 Credentials**:
    - Navigate to "APIs & Services" > "Credentials".
    - Create an OAuth 2.0 Client ID for a web application.
    - Set the authorized redirect URI to `http://localhost:3500/login/oauth2/code/myclient`.

3. **Add OAuth2 Client Details**:
    - Copy the client ID and client secret from the Google Cloud Console.

### Application Configuration

1. **Clone the Repository**:

   ```bash
   git https://github.com/virgile-am/oauthlab.git
