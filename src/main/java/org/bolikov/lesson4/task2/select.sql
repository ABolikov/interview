with intervals as (
    select schedule.id_film,
           schedule.id                                                as schedule_id,
           film.name,
           film.time,
           schedule.session_time,
           DATE_ADD(schedule.session_time, interval film.time MINUTE) as end_time
    from schedule
             join film on schedule.id_film = film.id
)
select film1.name,
       film1.session_time,
       film1.time,
       film2.name,
       film2.session_time,
       film2.time
from intervals film1
         join intervals film2 on film1.session_time < film2.end_time
    and film1.end_time > film2.session_time
    and film1.schedule_id <> film2.schedule_id
    and film1.id_film > film2.id_film;