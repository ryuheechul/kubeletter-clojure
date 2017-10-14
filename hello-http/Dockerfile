FROM clojure:lein-2.7.1

RUN mkdir -p /code
WORKDIR /code
COPY project.clj /code
RUN lein deps
